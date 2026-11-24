.class public final La/nku;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/p430;


# direct methods
.method public constructor <init>(La/p430;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, La/nku;->a:La/p430;

    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final a()La/ewt;
    .locals 6

    .line 1
    iget-object p0, p0, La/nku;->a:La/p430;

    .line 2
    .line 3
    iget-object v0, p0, La/p430;->a:La/he1;

    .line 4
    .line 5
    invoke-virtual {v0}, La/he1;->a()La/tt20;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iget-object v0, v0, La/tt20;->a:La/zdg0;

    .line 10
    .line 11
    const-string v1, "market_filter"

    .line 12
    .line 13
    filled-new-array {v1}, [Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    new-instance v2, La/sax;

    .line 18
    .line 19
    const/4 v3, 0x2

    .line 20
    const/16 v4, 0x1c

    .line 21
    .line 22
    const/4 v5, 0x0

    .line 23
    invoke-direct {v2, v3, v5, v4}, La/sax;-><init>(ILa/yje;B)V

    .line 24
    .line 25
    .line 26
    invoke-static {v0, v1, v2}, La/wwb;->C(La/zdg0;[Ljava/lang/String;Lkotlin/jvm/functions/Function2;)La/zj2;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    new-instance v1, La/ewt;

    .line 31
    .line 32
    const/16 v2, 0x1d

    .line 33
    .line 34
    invoke-direct {v1, v0, p0, v2}, La/ewt;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 35
    .line 36
    .line 37
    return-object v1
.end method
