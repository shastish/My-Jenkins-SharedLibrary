def call(Map params) {
    if (!params.job) {
        error "The 'job' parameter is required."
    }
    build job: params.job, parameters: params.parameters ?: []
}
