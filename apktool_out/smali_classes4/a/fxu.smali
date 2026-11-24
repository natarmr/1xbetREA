.class public final La/fxu;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/udg;


# direct methods
.method public synthetic constructor <init>(La/udg;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/fxu;->a:La/udg;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(ZLa/bnn0;)Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, La/fxu;->a:La/udg;

    .line 2
    .line 3
    iget-object p0, p0, La/udg;->b:La/tcg;

    .line 4
    .line 5
    iget-object p0, p0, La/tcg;->b:La/qoj0;

    .line 6
    .line 7
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-virtual {p0, p1, p2}, La/qoj0;->a(Ljava/lang/Object;La/yje;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    sget-object p1, La/wne;->a:La/wne;

    .line 16
    .line 17
    if-ne p0, p1, :cond_0

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 21
    .line 22
    :goto_0
    if-ne p0, p1, :cond_1

    .line 23
    .line 24
    goto :goto_1

    .line 25
    :cond_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 26
    .line 27
    :goto_1
    if-ne p0, p1, :cond_2

    .line 28
    .line 29
    return-object p0

    .line 30
    :cond_2
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 31
    .line 32
    return-object p0
.end method
