.class public final synthetic La/hwy;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/pu90;

.field public final synthetic c:La/p4e;

.field public final synthetic d:La/l7m0;


# direct methods
.method public synthetic constructor <init>(La/pu90;La/p4e;La/l7m0;B)V
    .locals 0

    .line 1
    iput-byte p4, p0, La/hwy;->a:B

    iput-object p1, p0, La/hwy;->b:La/pu90;

    iput-object p2, p0, La/hwy;->c:La/p4e;

    iput-object p3, p0, La/hwy;->d:La/l7m0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget-byte v0, p0, La/hwy;->a:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/high16 v2, 0x41000000    # 8.0f

    .line 5
    .line 6
    iget-object v3, p0, La/hwy;->d:La/l7m0;

    .line 7
    .line 8
    iget-object v4, p0, La/hwy;->c:La/p4e;

    .line 9
    .line 10
    iget-object p0, p0, La/hwy;->b:La/pu90;

    .line 11
    .line 12
    check-cast p1, La/ou90;

    .line 13
    .line 14
    packed-switch v0, :pswitch_data_0

    .line 15
    .line 16
    .line 17
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    iget-wide v4, v4, La/p4e;->a:J

    .line 21
    .line 22
    invoke-static {v4, v5}, La/p4e;->i(J)I

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    int-to-float v0, v0

    .line 27
    invoke-interface {v3}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    check-cast v3, Ljava/lang/Number;

    .line 32
    .line 33
    invoke-virtual {v3}, Ljava/lang/Number;->floatValue()F

    .line 34
    .line 35
    .line 36
    move-result v3

    .line 37
    mul-float/2addr v3, v0

    .line 38
    float-to-int v0, v3

    .line 39
    sget-object v3, La/qmk;->a:La/zcl;

    .line 40
    .line 41
    invoke-interface {p1, v2}, La/w6k;->T(F)I

    .line 42
    .line 43
    .line 44
    move-result v2

    .line 45
    invoke-virtual {p1, p0, v0, v2, v1}, La/ou90;->m(La/pu90;IIF)V

    .line 46
    .line 47
    .line 48
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 49
    .line 50
    return-object p0

    .line 51
    :pswitch_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 52
    .line 53
    .line 54
    iget-wide v4, v4, La/p4e;->a:J

    .line 55
    .line 56
    invoke-static {v4, v5}, La/p4e;->i(J)I

    .line 57
    .line 58
    .line 59
    move-result v0

    .line 60
    int-to-float v0, v0

    .line 61
    invoke-interface {v3}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v3

    .line 65
    check-cast v3, Ljava/lang/Number;

    .line 66
    .line 67
    invoke-virtual {v3}, Ljava/lang/Number;->floatValue()F

    .line 68
    .line 69
    .line 70
    move-result v3

    .line 71
    mul-float/2addr v3, v0

    .line 72
    float-to-int v0, v3

    .line 73
    sget-object v3, La/qmk;->a:La/zcl;

    .line 74
    .line 75
    invoke-interface {p1, v2}, La/w6k;->T(F)I

    .line 76
    .line 77
    .line 78
    move-result v2

    .line 79
    invoke-virtual {p1, p0, v0, v2, v1}, La/ou90;->m(La/pu90;IIF)V

    .line 80
    .line 81
    .line 82
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 83
    .line 84
    return-object p0

    .line 85
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
