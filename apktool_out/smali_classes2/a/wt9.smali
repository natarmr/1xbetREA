.class public final synthetic La/wt9;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Lkotlin/jvm/functions/Function1;

.field public final synthetic c:I


# direct methods
.method public synthetic constructor <init>(IILkotlin/jvm/functions/Function1;)V
    .locals 0

    .line 1
    const/4 p2, 0x0

    iput-byte p2, p0, La/wt9;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, La/wt9;->c:I

    iput-object p3, p0, La/wt9;->b:Lkotlin/jvm/functions/Function1;

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;I)V
    .locals 1

    .line 2
    const/4 v0, 0x1

    iput-byte v0, p0, La/wt9;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/wt9;->b:Lkotlin/jvm/functions/Function1;

    iput p2, p0, La/wt9;->c:I

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;IB)V
    .locals 0

    .line 3
    iput-byte p3, p0, La/wt9;->a:B

    iput-object p1, p0, La/wt9;->b:Lkotlin/jvm/functions/Function1;

    iput p2, p0, La/wt9;->c:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/wt9;->a:B

    .line 2
    .line 3
    check-cast p1, La/fet;

    .line 4
    .line 5
    check-cast p2, Ljava/lang/Integer;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    iget p2, p0, La/wt9;->c:I

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
    iget-object p0, p0, La/wt9;->b:Lkotlin/jvm/functions/Function1;

    .line 22
    .line 23
    invoke-static {p0, p1, p2}, La/wb;->w(Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 24
    .line 25
    .line 26
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 27
    .line 28
    return-object p0

    .line 29
    :pswitch_0
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 30
    .line 31
    .line 32
    iget p2, p0, La/wt9;->c:I

    .line 33
    .line 34
    or-int/lit8 p2, p2, 0x1

    .line 35
    .line 36
    invoke-static {p2}, La/x8x;->L(I)I

    .line 37
    .line 38
    .line 39
    move-result p2

    .line 40
    iget-object p0, p0, La/wt9;->b:Lkotlin/jvm/functions/Function1;

    .line 41
    .line 42
    invoke-static {p0, p1, p2}, La/vbw0;->q(Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 43
    .line 44
    .line 45
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 46
    .line 47
    return-object p0

    .line 48
    :pswitch_1
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 49
    .line 50
    .line 51
    iget p2, p0, La/wt9;->c:I

    .line 52
    .line 53
    or-int/lit8 p2, p2, 0x1

    .line 54
    .line 55
    invoke-static {p2}, La/x8x;->L(I)I

    .line 56
    .line 57
    .line 58
    move-result p2

    .line 59
    iget-object p0, p0, La/wt9;->b:Lkotlin/jvm/functions/Function1;

    .line 60
    .line 61
    invoke-static {p0, p1, p2}, La/rsr0;->d(Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 62
    .line 63
    .line 64
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 65
    .line 66
    return-object p0

    .line 67
    :pswitch_2
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 68
    .line 69
    .line 70
    iget p2, p0, La/wt9;->c:I

    .line 71
    .line 72
    or-int/lit8 p2, p2, 0x1

    .line 73
    .line 74
    invoke-static {p2}, La/x8x;->L(I)I

    .line 75
    .line 76
    .line 77
    move-result p2

    .line 78
    iget-object p0, p0, La/wt9;->b:Lkotlin/jvm/functions/Function1;

    .line 79
    .line 80
    invoke-static {p0, p1, p2}, La/y9a;->A(Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 81
    .line 82
    .line 83
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 84
    .line 85
    return-object p0

    .line 86
    :pswitch_3
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 87
    .line 88
    .line 89
    iget p2, p0, La/wt9;->c:I

    .line 90
    .line 91
    or-int/lit8 p2, p2, 0x1

    .line 92
    .line 93
    invoke-static {p2}, La/x8x;->L(I)I

    .line 94
    .line 95
    .line 96
    move-result p2

    .line 97
    iget-object p0, p0, La/wt9;->b:Lkotlin/jvm/functions/Function1;

    .line 98
    .line 99
    invoke-static {p0, p1, p2}, La/ay3;->x(Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 100
    .line 101
    .line 102
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 103
    .line 104
    return-object p0

    .line 105
    :pswitch_4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 106
    .line 107
    .line 108
    const/4 p2, 0x1

    .line 109
    invoke-static {p2}, La/x8x;->L(I)I

    .line 110
    .line 111
    .line 112
    move-result p2

    .line 113
    iget v0, p0, La/wt9;->c:I

    .line 114
    .line 115
    iget-object p0, p0, La/wt9;->b:Lkotlin/jvm/functions/Function1;

    .line 116
    .line 117
    invoke-static {v0, p0, p1, p2}, La/hmw0;->M(ILkotlin/jvm/functions/Function1;La/fet;I)V

    .line 118
    .line 119
    .line 120
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 121
    .line 122
    return-object p0

    .line 123
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
