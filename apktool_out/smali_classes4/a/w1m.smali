.class public final synthetic La/w1m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/mm40;

.field public final synthetic c:I

.field public final synthetic d:J


# direct methods
.method public synthetic constructor <init>(IJLa/mm40;)V
    .locals 1

    .line 1
    const/4 v0, 0x4

    iput-byte v0, p0, La/w1m;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p2, p0, La/w1m;->d:J

    iput-object p4, p0, La/w1m;->b:La/mm40;

    iput p1, p0, La/w1m;->c:I

    return-void
.end method

.method public synthetic constructor <init>(La/mm40;IJIB)V
    .locals 0

    .line 2
    iput-byte p6, p0, La/w1m;->a:B

    iput-object p1, p0, La/w1m;->b:La/mm40;

    iput p2, p0, La/w1m;->c:I

    iput-wide p3, p0, La/w1m;->d:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(La/mm40;JIB)V
    .locals 0

    .line 3
    iput-byte p5, p0, La/w1m;->a:B

    iput-object p1, p0, La/w1m;->b:La/mm40;

    iput-wide p2, p0, La/w1m;->d:J

    iput p4, p0, La/w1m;->c:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget-byte v0, p0, La/w1m;->a:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, La/fet;

    .line 7
    .line 8
    check-cast p2, Ljava/lang/Integer;

    .line 9
    .line 10
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    iget p2, p0, La/w1m;->c:I

    .line 14
    .line 15
    or-int/lit8 p2, p2, 0x1

    .line 16
    .line 17
    invoke-static {p2}, La/x8x;->L(I)I

    .line 18
    .line 19
    .line 20
    move-result p2

    .line 21
    iget-wide v0, p0, La/w1m;->d:J

    .line 22
    .line 23
    iget-object p0, p0, La/w1m;->b:La/mm40;

    .line 24
    .line 25
    invoke-static {p2, v0, v1, p1, p0}, La/l8x;->h(IJLa/fet;La/mm40;)V

    .line 26
    .line 27
    .line 28
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 29
    .line 30
    return-object p0

    .line 31
    :pswitch_0
    check-cast p1, La/fet;

    .line 32
    .line 33
    check-cast p2, Ljava/lang/Integer;

    .line 34
    .line 35
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    iget p2, p0, La/w1m;->c:I

    .line 39
    .line 40
    or-int/lit8 p2, p2, 0x1

    .line 41
    .line 42
    invoke-static {p2}, La/x8x;->L(I)I

    .line 43
    .line 44
    .line 45
    move-result p2

    .line 46
    iget-wide v0, p0, La/w1m;->d:J

    .line 47
    .line 48
    iget-object p0, p0, La/w1m;->b:La/mm40;

    .line 49
    .line 50
    invoke-static {p2, v0, v1, p1, p0}, La/vdx;->e(IJLa/fet;La/mm40;)V

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
    move-result v1

    .line 69
    iget v0, p0, La/w1m;->c:I

    .line 70
    .line 71
    iget-wide v2, p0, La/w1m;->d:J

    .line 72
    .line 73
    iget-object v5, p0, La/w1m;->b:La/mm40;

    .line 74
    .line 75
    invoke-static/range {v0 .. v5}, La/v3c;->G(IIJLa/fet;La/mm40;)V

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
    move-result v1

    .line 94
    iget v0, p0, La/w1m;->c:I

    .line 95
    .line 96
    iget-wide v2, p0, La/w1m;->d:J

    .line 97
    .line 98
    iget-object v5, p0, La/w1m;->b:La/mm40;

    .line 99
    .line 100
    invoke-static/range {v0 .. v5}, La/hew0;->f(IIJLa/fet;La/mm40;)V

    .line 101
    .line 102
    .line 103
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 104
    .line 105
    return-object p0

    .line 106
    :pswitch_3
    check-cast p1, La/fet;

    .line 107
    .line 108
    check-cast p2, Ljava/lang/Integer;

    .line 109
    .line 110
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 111
    .line 112
    .line 113
    iget p2, p0, La/w1m;->c:I

    .line 114
    .line 115
    or-int/lit8 p2, p2, 0x1

    .line 116
    .line 117
    invoke-static {p2}, La/x8x;->L(I)I

    .line 118
    .line 119
    .line 120
    move-result p2

    .line 121
    iget-wide v0, p0, La/w1m;->d:J

    .line 122
    .line 123
    iget-object p0, p0, La/w1m;->b:La/mm40;

    .line 124
    .line 125
    invoke-static {p2, v0, v1, p1, p0}, La/lmc;->l(IJLa/fet;La/mm40;)V

    .line 126
    .line 127
    .line 128
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 129
    .line 130
    return-object p0

    .line 131
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
