.class public final La/spc;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/h0q0;


# direct methods
.method public synthetic constructor <init>(La/h0q0;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/spc;->a:La/h0q0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(La/bnn0;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object p0, p0, La/spc;->a:La/h0q0;

    .line 2
    .line 3
    iget-object p0, p0, La/h0q0;->b:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast p0, La/s5r0;

    .line 6
    .line 7
    iget-object p0, p0, La/s5r0;->d:La/qoj0;

    .line 8
    .line 9
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 10
    .line 11
    invoke-virtual {p0, v0, p1}, La/qoj0;->a(Ljava/lang/Object;La/yje;)Ljava/lang/Object;

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
    move-object p0, v0

    .line 21
    :goto_0
    if-ne p0, p1, :cond_1

    .line 22
    .line 23
    goto :goto_1

    .line 24
    :cond_1
    move-object p0, v0

    .line 25
    :goto_1
    if-ne p0, p1, :cond_2

    .line 26
    .line 27
    return-object p0

    .line 28
    :cond_2
    return-object v0
.end method
