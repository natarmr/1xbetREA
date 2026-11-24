.class public final synthetic La/fg5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/mm40;

.field public final synthetic c:Ljava/lang/String;

.field public final synthetic d:Lkotlin/jvm/functions/Function0;

.field public final synthetic e:I


# direct methods
.method public synthetic constructor <init>(La/mm40;Ljava/lang/String;ILkotlin/jvm/functions/Function0;I)V
    .locals 0

    .line 1
    const/4 p5, 0x0

    iput-byte p5, p0, La/fg5;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/fg5;->b:La/mm40;

    iput-object p2, p0, La/fg5;->c:Ljava/lang/String;

    iput p3, p0, La/fg5;->e:I

    iput-object p4, p0, La/fg5;->d:Lkotlin/jvm/functions/Function0;

    return-void
.end method

.method public synthetic constructor <init>(La/mm40;Ljava/lang/String;Lkotlin/jvm/functions/Function0;IB)V
    .locals 0

    .line 2
    iput-byte p5, p0, La/fg5;->a:B

    iput-object p1, p0, La/fg5;->b:La/mm40;

    iput-object p2, p0, La/fg5;->c:Ljava/lang/String;

    iput-object p3, p0, La/fg5;->d:Lkotlin/jvm/functions/Function0;

    iput p4, p0, La/fg5;->e:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget-byte v0, p0, La/fg5;->a:B

    .line 2
    .line 3
    iget v1, p0, La/fg5;->e:I

    .line 4
    .line 5
    iget-object v2, p0, La/fg5;->d:Lkotlin/jvm/functions/Function0;

    .line 6
    .line 7
    iget-object v3, p0, La/fg5;->c:Ljava/lang/String;

    .line 8
    .line 9
    iget-object v4, p0, La/fg5;->b:La/mm40;

    .line 10
    .line 11
    const/4 v5, 0x1

    .line 12
    packed-switch v0, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    check-cast p1, La/fet;

    .line 16
    .line 17
    check-cast p2, Ljava/lang/Integer;

    .line 18
    .line 19
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    or-int/lit8 p0, v1, 0x1

    .line 23
    .line 24
    invoke-static {p0}, La/x8x;->L(I)I

    .line 25
    .line 26
    .line 27
    move-result p0

    .line 28
    invoke-static {v4, v3, v2, p1, p0}, La/zdx;->h(La/mm40;Ljava/lang/String;Lkotlin/jvm/functions/Function0;La/fet;I)V

    .line 29
    .line 30
    .line 31
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 32
    .line 33
    return-object p0

    .line 34
    :pswitch_0
    check-cast p1, La/fet;

    .line 35
    .line 36
    check-cast p2, Ljava/lang/Integer;

    .line 37
    .line 38
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    or-int/lit8 p0, v1, 0x1

    .line 42
    .line 43
    invoke-static {p0}, La/x8x;->L(I)I

    .line 44
    .line 45
    .line 46
    move-result p0

    .line 47
    invoke-static {v4, v3, v2, p1, p0}, La/j120;->G(La/mm40;Ljava/lang/String;Lkotlin/jvm/functions/Function0;La/fet;I)V

    .line 48
    .line 49
    .line 50
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 51
    .line 52
    return-object p0

    .line 53
    :pswitch_1
    check-cast p1, La/fet;

    .line 54
    .line 55
    check-cast p2, Ljava/lang/Integer;

    .line 56
    .line 57
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 58
    .line 59
    .line 60
    or-int/lit8 p0, v1, 0x1

    .line 61
    .line 62
    invoke-static {p0}, La/x8x;->L(I)I

    .line 63
    .line 64
    .line 65
    move-result p0

    .line 66
    invoke-static {v4, v3, v2, p1, p0}, La/acb;->x(La/mm40;Ljava/lang/String;Lkotlin/jvm/functions/Function0;La/fet;I)V

    .line 67
    .line 68
    .line 69
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 70
    .line 71
    return-object p0

    .line 72
    :pswitch_2
    check-cast p1, La/fet;

    .line 73
    .line 74
    check-cast p2, Ljava/lang/Integer;

    .line 75
    .line 76
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 77
    .line 78
    .line 79
    or-int/lit8 p0, v1, 0x1

    .line 80
    .line 81
    invoke-static {p0}, La/x8x;->L(I)I

    .line 82
    .line 83
    .line 84
    move-result p0

    .line 85
    invoke-static {v4, v3, v2, p1, p0}, La/hew0;->B(La/mm40;Ljava/lang/String;Lkotlin/jvm/functions/Function0;La/fet;I)V

    .line 86
    .line 87
    .line 88
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 89
    .line 90
    return-object p0

    .line 91
    :pswitch_3
    check-cast p1, La/fet;

    .line 92
    .line 93
    check-cast p2, Ljava/lang/Integer;

    .line 94
    .line 95
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 96
    .line 97
    .line 98
    or-int/lit8 p0, v1, 0x1

    .line 99
    .line 100
    invoke-static {p0}, La/x8x;->L(I)I

    .line 101
    .line 102
    .line 103
    move-result p0

    .line 104
    invoke-static {v4, v3, v2, p1, p0}, La/rsr0;->M(La/mm40;Ljava/lang/String;Lkotlin/jvm/functions/Function0;La/fet;I)V

    .line 105
    .line 106
    .line 107
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 108
    .line 109
    return-object p0

    .line 110
    :pswitch_4
    move-object v4, p1

    .line 111
    check-cast v4, La/fet;

    .line 112
    .line 113
    check-cast p2, Ljava/lang/Integer;

    .line 114
    .line 115
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 116
    .line 117
    .line 118
    invoke-static {v5}, La/x8x;->L(I)I

    .line 119
    .line 120
    .line 121
    move-result v5

    .line 122
    iget-object v0, p0, La/fg5;->b:La/mm40;

    .line 123
    .line 124
    iget-object v1, p0, La/fg5;->c:Ljava/lang/String;

    .line 125
    .line 126
    iget v2, p0, La/fg5;->e:I

    .line 127
    .line 128
    iget-object v3, p0, La/fg5;->d:Lkotlin/jvm/functions/Function0;

    .line 129
    .line 130
    invoke-static/range {v0 .. v5}, La/xia0;->g(La/mm40;Ljava/lang/String;ILkotlin/jvm/functions/Function0;La/fet;I)V

    .line 131
    .line 132
    .line 133
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 134
    .line 135
    return-object p0

    .line 136
    nop

    .line 137
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
