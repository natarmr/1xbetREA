.class public final La/wwv;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/rrd;


# direct methods
.method public synthetic constructor <init>(La/rrd;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/wwv;->a:La/rrd;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(La/ctx;La/bnn0;)Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, La/wwv;->a:La/rrd;

    .line 2
    .line 3
    iget-object p0, p0, La/rrd;->g:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast p0, La/m0w;

    .line 6
    .line 7
    iget-object p0, p0, La/m0w;->a:La/qoj0;

    .line 8
    .line 9
    invoke-virtual {p0, p1, p2}, La/qoj0;->a(Ljava/lang/Object;La/yje;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    sget-object p1, La/wne;->a:La/wne;

    .line 14
    .line 15
    if-ne p0, p1, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 19
    .line 20
    :goto_0
    if-ne p0, p1, :cond_1

    .line 21
    .line 22
    goto :goto_1

    .line 23
    :cond_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 24
    .line 25
    :goto_1
    if-ne p0, p1, :cond_2

    .line 26
    .line 27
    return-object p0

    .line 28
    :cond_2
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 29
    .line 30
    return-object p0
.end method
