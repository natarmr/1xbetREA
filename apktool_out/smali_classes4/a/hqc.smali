.class public final La/hqc;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/m0o0;


# direct methods
.method public synthetic constructor <init>(La/m0o0;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/hqc;->a:La/m0o0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()La/gmq;
    .locals 5

    .line 1
    iget-object p0, p0, La/hqc;->a:La/m0o0;

    .line 2
    .line 3
    iget-object p0, p0, La/m0o0;->b:La/abp;

    .line 4
    .line 5
    iget-object v0, p0, La/abp;->c:La/p7m0;

    .line 6
    .line 7
    invoke-static {v0}, La/abp;->d(La/gmq;)La/rwk;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iget-object p0, p0, La/abp;->g:La/p7m0;

    .line 12
    .line 13
    new-instance v1, La/h2c;

    .line 14
    .line 15
    const/4 v2, 0x7

    .line 16
    invoke-direct {v1, p0, v2}, La/h2c;-><init>(La/p7m0;B)V

    .line 17
    .line 18
    .line 19
    new-instance p0, La/y8p;

    .line 20
    .line 21
    const/4 v2, 0x3

    .line 22
    const/16 v3, 0xa

    .line 23
    .line 24
    const/4 v4, 0x0

    .line 25
    invoke-direct {p0, v2, v4, v3}, La/y8p;-><init>(ILa/yje;B)V

    .line 26
    .line 27
    .line 28
    new-instance v2, La/p6d;

    .line 29
    .line 30
    const/4 v3, 0x1

    .line 31
    invoke-direct {v2, v0, v1, p0, v3}, La/p6d;-><init>(La/gmq;La/gmq;La/xdr;B)V

    .line 32
    .line 33
    .line 34
    invoke-static {v2}, La/i120;->W(La/gmq;)La/gmq;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    return-object p0
.end method
