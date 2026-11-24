.class public final synthetic La/vly;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/zly;


# direct methods
.method public synthetic constructor <init>(La/zly;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/vly;->a:B

    iput-object p1, p0, La/vly;->b:La/zly;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget-byte v0, p0, La/vly;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/vly;->b:La/zly;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p1, La/t33;

    .line 9
    .line 10
    invoke-virtual {p1}, La/t33;->d()Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    check-cast p1, Ljava/lang/Number;

    .line 15
    .line 16
    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    iput p1, p0, La/zly;->q:F

    .line 21
    .line 22
    invoke-static {p0}, La/n7x;->I(La/v6z;)V

    .line 23
    .line 24
    .line 25
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 26
    .line 27
    return-object p0

    .line 28
    :pswitch_0
    check-cast p1, La/bff0;

    .line 29
    .line 30
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    sget-object v0, La/bmd;->u:La/zfn;

    .line 34
    .line 35
    invoke-static {p0, v0}, La/mbc;->R(La/vld;Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    check-cast v0, La/rhv0;

    .line 40
    .line 41
    check-cast v0, La/yez;

    .line 42
    .line 43
    invoke-virtual {v0}, La/yez;->b()J

    .line 44
    .line 45
    .line 46
    move-result-wide v0

    .line 47
    const-wide v2, 0xffffffffL

    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    and-long/2addr v0, v2

    .line 53
    long-to-int v0, v0

    .line 54
    iget-wide v1, p1, La/bff0;->b:J

    .line 55
    .line 56
    long-to-int p1, v1

    .line 57
    sub-int/2addr v0, p1

    .line 58
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    iput-object p1, p0, La/zly;->s:Ljava/lang/Integer;

    .line 63
    .line 64
    invoke-virtual {p0}, La/zly;->a1()V

    .line 65
    .line 66
    .line 67
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 68
    .line 69
    return-object p0

    .line 70
    nop

    .line 71
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
