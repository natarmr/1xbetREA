from mitmproxy import http

LOG = r"D:\1xbetrea\_tools\flows.log"

def request(flow: http.HTTPFlow):
    try:
        with open(LOG, "a", encoding="utf-8") as f:
            f.write(f"{flow.request.method} {flow.request.pretty_url}\n")
    except Exception:
        pass
