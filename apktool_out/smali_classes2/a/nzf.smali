.class public interface abstract La/nzf;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008f\u0018\u00002\u00020\u0001J$\u0010\u0006\u001a\u00020\u00052\u0008\u0008\u0001\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0003\u0010\u0004\u001a\u00020\u0001H\u00a7@\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J8\u0010\u000c\u001a\u00020\u000b2\u0008\u0008\u0001\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0001\u0010\u0008\u001a\u00020\u00022\u0008\u0008\u0001\u0010\n\u001a\u00020\t2\u0008\u0008\u0003\u0010\u0004\u001a\u00020\u0001H\u00a7@\u00a2\u0006\u0004\u0008\u000c\u0010\rJ8\u0010\u000f\u001a\u00020\u000b2\u0008\u0008\u0001\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0001\u0010\u0008\u001a\u00020\u00022\u0008\u0008\u0001\u0010\n\u001a\u00020\u000e2\u0008\u0008\u0003\u0010\u0004\u001a\u00020\u0001H\u00a7@\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J8\u0010\u0012\u001a\u00020\u000b2\u0008\u0008\u0001\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0001\u0010\u0008\u001a\u00020\u00022\u0008\u0008\u0001\u0010\n\u001a\u00020\u00112\u0008\u0008\u0003\u0010\u0004\u001a\u00020\u0001H\u00a7@\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J.\u0010\u0015\u001a\u00020\u000b2\u0008\u0008\u0001\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0001\u0010\n\u001a\u00020\u00142\u0008\u0008\u0003\u0010\u0004\u001a\u00020\u0001H\u00a7@\u00a2\u0006\u0004\u0008\u0015\u0010\u0016\u00a8\u0006\u0017\u00c0\u0006\u0003"
    }
    d2 = {
        "La/nzf;",
        "",
        "",
        "customerIOAuthToken",
        "tag",
        "La/yf;",
        "a",
        "(Ljava/lang/String;Ljava/lang/Object;La/yje;)Ljava/lang/Object;",
        "customerId",
        "La/mzf;",
        "request",
        "",
        "c",
        "(Ljava/lang/String;Ljava/lang/String;La/mzf;Ljava/lang/Object;La/yje;)Ljava/lang/Object;",
        "La/yyf;",
        "e",
        "(Ljava/lang/String;Ljava/lang/String;La/yyf;Ljava/lang/Object;La/yje;)Ljava/lang/Object;",
        "La/qyf;",
        "d",
        "(Ljava/lang/String;Ljava/lang/String;La/qyf;Ljava/lang/Object;La/yje;)Ljava/lang/Object;",
        "La/tyf;",
        "b",
        "(Ljava/lang/String;La/tyf;Ljava/lang/Object;La/yje;)Ljava/lang/Object;",
        "impl"
    }
    k = 0x1
    mv = {
        0x2,
        0x4,
        0x0
    }
    xi = 0x30
.end annotation


# virtual methods
.method public abstract a(Ljava/lang/String;Ljava/lang/Object;La/yje;)Ljava/lang/Object;
    .param p1    # Ljava/lang/String;
        .annotation runtime La/xpv;
            value = "Authorization"
        .end annotation
    .end param
    .param p2    # Ljava/lang/Object;
        .annotation runtime La/doo0;
        .end annotation
    .end param
    .annotation runtime La/ofr;
        value = "/api/v1/accounts/region"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            "La/yje<",
            "-",
            "La/yf;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract b(Ljava/lang/String;La/tyf;Ljava/lang/Object;La/yje;)Ljava/lang/Object;
    .param p1    # Ljava/lang/String;
        .annotation runtime La/xpv;
            value = "Authorization"
        .end annotation
    .end param
    .param p2    # La/tyf;
        .annotation runtime La/jb8;
        .end annotation
    .end param
    .param p3    # Ljava/lang/Object;
        .annotation runtime La/doo0;
        .end annotation
    .end param
    .annotation runtime La/kg80;
        value = "/api/v1/metrics"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "La/tyf;",
            "Ljava/lang/Object;",
            "La/yje<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract c(Ljava/lang/String;Ljava/lang/String;La/mzf;Ljava/lang/Object;La/yje;)Ljava/lang/Object;
    .param p1    # Ljava/lang/String;
        .annotation runtime La/xpv;
            value = "Authorization"
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation runtime La/z190;
            value = "customer_id"
        .end annotation
    .end param
    .param p3    # La/mzf;
        .annotation runtime La/jb8;
        .end annotation
    .end param
    .param p4    # Ljava/lang/Object;
        .annotation runtime La/doo0;
        .end annotation
    .end param
    .annotation runtime La/lg80;
        value = "/api/v1/customers/{customer_id}"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "La/mzf;",
            "Ljava/lang/Object;",
            "La/yje<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract d(Ljava/lang/String;Ljava/lang/String;La/qyf;Ljava/lang/Object;La/yje;)Ljava/lang/Object;
    .param p1    # Ljava/lang/String;
        .annotation runtime La/xpv;
            value = "Authorization"
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation runtime La/z190;
            value = "customer_id"
        .end annotation
    .end param
    .param p3    # La/qyf;
        .annotation runtime La/jb8;
        .end annotation
    .end param
    .param p4    # Ljava/lang/Object;
        .annotation runtime La/doo0;
        .end annotation
    .end param
    .annotation runtime La/lg80;
        value = "/api/v1/customers/{customer_id}/devices"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "La/qyf;",
            "Ljava/lang/Object;",
            "La/yje<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract e(Ljava/lang/String;Ljava/lang/String;La/yyf;Ljava/lang/Object;La/yje;)Ljava/lang/Object;
    .param p1    # Ljava/lang/String;
        .annotation runtime La/xpv;
            value = "Authorization"
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation runtime La/z190;
            value = "customer_id"
        .end annotation
    .end param
    .param p3    # La/yyf;
        .annotation runtime La/jb8;
        .end annotation
    .end param
    .param p4    # Ljava/lang/Object;
        .annotation runtime La/doo0;
        .end annotation
    .end param
    .annotation runtime La/lg80;
        value = "/api/v1/customers/{customer_id}"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "La/yyf;",
            "Ljava/lang/Object;",
            "La/yje<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method
