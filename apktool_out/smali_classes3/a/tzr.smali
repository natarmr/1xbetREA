.class public final synthetic La/tzr;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/etr;

.field public final synthetic c:La/cp;


# direct methods
.method public synthetic constructor <init>(La/etr;La/cp;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/tzr;->a:B

    iput-object p1, p0, La/tzr;->b:La/etr;

    iput-object p2, p0, La/tzr;->c:La/cp;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-byte v0, p0, La/tzr;->a:B

    .line 2
    .line 3
    iget-object v1, p0, La/tzr;->c:La/cp;

    .line 4
    .line 5
    iget-object p0, p0, La/tzr;->b:La/etr;

    .line 6
    .line 7
    check-cast p1, Ljava/lang/Integer;

    .line 8
    .line 9
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    check-cast p2, Ljava/lang/Integer;

    .line 14
    .line 15
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 16
    .line 17
    .line 18
    move-result p2

    .line 19
    packed-switch v0, :pswitch_data_0

    .line 20
    .line 21
    .line 22
    invoke-virtual {v1}, La/cp;->u()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    check-cast v0, La/zzr;

    .line 27
    .line 28
    iget-object v0, v0, La/zzr;->c:La/qtr;

    .line 29
    .line 30
    invoke-static {p0, v0, p1, p2}, La/fbc;->R(La/etr;La/qtr;II)V

    .line 31
    .line 32
    .line 33
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 34
    .line 35
    return-object p0

    .line 36
    :pswitch_0
    invoke-virtual {v1}, La/cp;->u()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    check-cast v0, La/zzr;

    .line 41
    .line 42
    iget-object v0, v0, La/zzr;->c:La/qtr;

    .line 43
    .line 44
    invoke-static {p0, v0, p1, p2}, La/fbc;->Q(La/etr;La/qtr;II)V

    .line 45
    .line 46
    .line 47
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 48
    .line 49
    return-object p0

    .line 50
    :pswitch_1
    invoke-virtual {v1}, La/cp;->u()Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    check-cast v0, La/rzr;

    .line 55
    .line 56
    iget-object v0, v0, La/rzr;->c:La/qtr;

    .line 57
    .line 58
    invoke-static {p0, v0, p1, p2}, La/fbc;->R(La/etr;La/qtr;II)V

    .line 59
    .line 60
    .line 61
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 62
    .line 63
    return-object p0

    .line 64
    :pswitch_2
    invoke-virtual {v1}, La/cp;->u()Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    check-cast v0, La/rzr;

    .line 69
    .line 70
    iget-object v0, v0, La/rzr;->c:La/qtr;

    .line 71
    .line 72
    invoke-static {p0, v0, p1, p2}, La/fbc;->Q(La/etr;La/qtr;II)V

    .line 73
    .line 74
    .line 75
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 76
    .line 77
    return-object p0

    .line 78
    nop

    .line 79
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
