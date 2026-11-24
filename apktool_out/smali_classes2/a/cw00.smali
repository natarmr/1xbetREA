.class public final La/cw00;
.super La/guy;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:La/dw00;


# direct methods
.method public constructor <init>(La/dw00;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/cw00;->a:La/dw00;

    .line 2
    .line 3
    const/4 p1, 0x0

    .line 4
    invoke-direct {p0, p1}, La/guy;-><init>(I)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    .line 1
    new-instance v0, Lokhttp3/logging/HttpLoggingInterceptor;

    .line 2
    .line 3
    new-instance v1, La/bw00;

    .line 4
    .line 5
    iget-object p0, p0, La/cw00;->a:La/dw00;

    .line 6
    .line 7
    invoke-direct {v1, p0}, La/bw00;-><init>(La/dw00;)V

    .line 8
    .line 9
    .line 10
    invoke-direct {v0, v1}, Lokhttp3/logging/HttpLoggingInterceptor;-><init>(Lokhttp3/logging/HttpLoggingInterceptor$Logger;)V

    .line 11
    .line 12
    .line 13
    return-object v0
.end method
