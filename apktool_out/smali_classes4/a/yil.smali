.class public final synthetic La/yil;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:J

.field public final synthetic c:La/sd;

.field public final synthetic d:La/rd;


# direct methods
.method public synthetic constructor <init>(JLa/sd;La/rd;IB)V
    .locals 0

    .line 1
    iput-byte p6, p0, La/yil;->a:B

    iput-wide p1, p0, La/yil;->b:J

    iput-object p3, p0, La/yil;->c:La/sd;

    iput-object p4, p0, La/yil;->d:La/rd;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget-byte v0, p0, La/yil;->a:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    move-object v5, p1

    .line 7
    check-cast v5, La/fet;

    .line 8
    .line 9
    check-cast p2, Ljava/lang/Integer;

    .line 10
    .line 11
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    const/4 p1, 0x1

    .line 15
    invoke-static {p1}, La/x8x;->L(I)I

    .line 16
    .line 17
    .line 18
    move-result v6

    .line 19
    iget-wide v1, p0, La/yil;->b:J

    .line 20
    .line 21
    iget-object v3, p0, La/yil;->c:La/sd;

    .line 22
    .line 23
    iget-object v4, p0, La/yil;->d:La/rd;

    .line 24
    .line 25
    invoke-static/range {v1 .. v6}, La/jcb;->D(JLa/sd;La/rd;La/fet;I)V

    .line 26
    .line 27
    .line 28
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 29
    .line 30
    return-object p0

    .line 31
    :pswitch_0
    move-object v4, p1

    .line 32
    check-cast v4, La/fet;

    .line 33
    .line 34
    check-cast p2, Ljava/lang/Integer;

    .line 35
    .line 36
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 37
    .line 38
    .line 39
    const/4 p1, 0x1

    .line 40
    invoke-static {p1}, La/x8x;->L(I)I

    .line 41
    .line 42
    .line 43
    move-result v5

    .line 44
    iget-wide v0, p0, La/yil;->b:J

    .line 45
    .line 46
    iget-object v2, p0, La/yil;->c:La/sd;

    .line 47
    .line 48
    iget-object v3, p0, La/yil;->d:La/rd;

    .line 49
    .line 50
    invoke-static/range {v0 .. v5}, La/jcb;->B(JLa/sd;La/rd;La/fet;I)V

    .line 51
    .line 52
    .line 53
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 54
    .line 55
    return-object p0

    .line 56
    :pswitch_1
    move-object v4, p1

    .line 57
    check-cast v4, La/fet;

    .line 58
    .line 59
    check-cast p2, Ljava/lang/Integer;

    .line 60
    .line 61
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 62
    .line 63
    .line 64
    const/4 p1, 0x1

    .line 65
    invoke-static {p1}, La/x8x;->L(I)I

    .line 66
    .line 67
    .line 68
    move-result v5

    .line 69
    iget-wide v0, p0, La/yil;->b:J

    .line 70
    .line 71
    iget-object v2, p0, La/yil;->c:La/sd;

    .line 72
    .line 73
    iget-object v3, p0, La/yil;->d:La/rd;

    .line 74
    .line 75
    invoke-static/range {v0 .. v5}, La/jcb;->C(JLa/sd;La/rd;La/fet;I)V

    .line 76
    .line 77
    .line 78
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 79
    .line 80
    return-object p0

    .line 81
    :pswitch_2
    move-object v4, p1

    .line 82
    check-cast v4, La/fet;

    .line 83
    .line 84
    check-cast p2, Ljava/lang/Integer;

    .line 85
    .line 86
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 87
    .line 88
    .line 89
    const/4 p1, 0x1

    .line 90
    invoke-static {p1}, La/x8x;->L(I)I

    .line 91
    .line 92
    .line 93
    move-result v5

    .line 94
    iget-wide v0, p0, La/yil;->b:J

    .line 95
    .line 96
    iget-object v2, p0, La/yil;->c:La/sd;

    .line 97
    .line 98
    iget-object v3, p0, La/yil;->d:La/rd;

    .line 99
    .line 100
    invoke-static/range {v0 .. v5}, La/jcb;->A(JLa/sd;La/rd;La/fet;I)V

    .line 101
    .line 102
    .line 103
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 104
    .line 105
    return-object p0

    .line 106
    nop

    .line 107
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
