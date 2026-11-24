.class public final synthetic La/aze;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/gze;

.field public final synthetic c:La/fxo;


# direct methods
.method public synthetic constructor <init>(La/gze;La/fxo;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/aze;->a:B

    iput-object p1, p0, La/aze;->b:La/gze;

    iput-object p2, p0, La/aze;->c:La/fxo;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-byte v0, p0, La/aze;->a:B

    .line 2
    .line 3
    iget-object v1, p0, La/aze;->c:La/fxo;

    .line 4
    .line 5
    iget-object p0, p0, La/aze;->b:La/gze;

    .line 6
    .line 7
    check-cast p1, Landroid/view/View;

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    sget-object v0, La/gze;->S1:La/usd;

    .line 13
    .line 14
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0}, La/gze;->I0()La/qg20;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    iget-object p1, v1, La/fxo;->c:La/ixo;

    .line 22
    .line 23
    iget-wide v0, p1, La/ixo;->b:D

    .line 24
    .line 25
    invoke-virtual {p0, v0, v1}, La/qg20;->Z(D)V

    .line 26
    .line 27
    .line 28
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 29
    .line 30
    return-object p0

    .line 31
    :pswitch_0
    sget-object v0, La/gze;->S1:La/usd;

    .line 32
    .line 33
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    invoke-virtual {p0}, La/gze;->I0()La/qg20;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    iget-object p1, v1, La/fxo;->b:La/ixo;

    .line 41
    .line 42
    iget-wide v0, p1, La/ixo;->b:D

    .line 43
    .line 44
    invoke-virtual {p0, v0, v1}, La/qg20;->Z(D)V

    .line 45
    .line 46
    .line 47
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 48
    .line 49
    return-object p0

    .line 50
    :pswitch_1
    sget-object v0, La/gze;->S1:La/usd;

    .line 51
    .line 52
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 53
    .line 54
    .line 55
    invoke-virtual {p0}, La/gze;->I0()La/qg20;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    iget-object p1, v1, La/fxo;->a:La/ixo;

    .line 60
    .line 61
    iget-wide v0, p1, La/ixo;->b:D

    .line 62
    .line 63
    invoke-virtual {p0, v0, v1}, La/qg20;->Z(D)V

    .line 64
    .line 65
    .line 66
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 67
    .line 68
    return-object p0

    .line 69
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
