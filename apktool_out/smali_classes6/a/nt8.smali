.class public final synthetic La/nt8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/mm40;

.field public final synthetic c:Ljava/util/List;

.field public final synthetic d:Lkotlin/jvm/functions/Function1;

.field public final synthetic e:I


# direct methods
.method public synthetic constructor <init>(La/mm40;Ljava/util/List;ILkotlin/jvm/functions/Function1;I)V
    .locals 0

    .line 1
    const/4 p5, 0x0

    iput-byte p5, p0, La/nt8;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/nt8;->b:La/mm40;

    iput-object p2, p0, La/nt8;->c:Ljava/util/List;

    iput p3, p0, La/nt8;->e:I

    iput-object p4, p0, La/nt8;->d:Lkotlin/jvm/functions/Function1;

    return-void
.end method

.method public synthetic constructor <init>(La/mm40;Ljava/util/List;Lkotlin/jvm/functions/Function1;IB)V
    .locals 0

    .line 2
    iput-byte p5, p0, La/nt8;->a:B

    iput-object p1, p0, La/nt8;->b:La/mm40;

    iput-object p2, p0, La/nt8;->c:Ljava/util/List;

    iput-object p3, p0, La/nt8;->d:Lkotlin/jvm/functions/Function1;

    iput p4, p0, La/nt8;->e:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget-byte v0, p0, La/nt8;->a:B

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
    iget p2, p0, La/nt8;->e:I

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
    iget-object v0, p0, La/nt8;->b:La/mm40;

    .line 22
    .line 23
    iget-object v1, p0, La/nt8;->c:Ljava/util/List;

    .line 24
    .line 25
    iget-object p0, p0, La/nt8;->d:Lkotlin/jvm/functions/Function1;

    .line 26
    .line 27
    invoke-static {p2, p1, v0, v1, p0}, La/bdx;->k(ILa/fet;La/mm40;Ljava/util/List;Lkotlin/jvm/functions/Function1;)V

    .line 28
    .line 29
    .line 30
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 31
    .line 32
    return-object p0

    .line 33
    :pswitch_0
    check-cast p1, La/fet;

    .line 34
    .line 35
    check-cast p2, Ljava/lang/Integer;

    .line 36
    .line 37
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    iget p2, p0, La/nt8;->e:I

    .line 41
    .line 42
    or-int/lit8 p2, p2, 0x1

    .line 43
    .line 44
    invoke-static {p2}, La/x8x;->L(I)I

    .line 45
    .line 46
    .line 47
    move-result p2

    .line 48
    iget-object v0, p0, La/nt8;->b:La/mm40;

    .line 49
    .line 50
    iget-object v1, p0, La/nt8;->c:Ljava/util/List;

    .line 51
    .line 52
    iget-object p0, p0, La/nt8;->d:Lkotlin/jvm/functions/Function1;

    .line 53
    .line 54
    invoke-static {p2, p1, v0, v1, p0}, La/mbc;->B(ILa/fet;La/mm40;Ljava/util/List;Lkotlin/jvm/functions/Function1;)V

    .line 55
    .line 56
    .line 57
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 58
    .line 59
    return-object p0

    .line 60
    :pswitch_1
    check-cast p1, La/fet;

    .line 61
    .line 62
    check-cast p2, Ljava/lang/Integer;

    .line 63
    .line 64
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 65
    .line 66
    .line 67
    iget p2, p0, La/nt8;->e:I

    .line 68
    .line 69
    or-int/lit8 p2, p2, 0x1

    .line 70
    .line 71
    invoke-static {p2}, La/x8x;->L(I)I

    .line 72
    .line 73
    .line 74
    move-result p2

    .line 75
    iget-object v0, p0, La/nt8;->b:La/mm40;

    .line 76
    .line 77
    iget-object v1, p0, La/nt8;->c:Ljava/util/List;

    .line 78
    .line 79
    iget-object p0, p0, La/nt8;->d:Lkotlin/jvm/functions/Function1;

    .line 80
    .line 81
    invoke-static {p2, p1, v0, v1, p0}, La/y860;->o(ILa/fet;La/mm40;Ljava/util/List;Lkotlin/jvm/functions/Function1;)V

    .line 82
    .line 83
    .line 84
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 85
    .line 86
    return-object p0

    .line 87
    :pswitch_2
    check-cast p1, La/fet;

    .line 88
    .line 89
    check-cast p2, Ljava/lang/Integer;

    .line 90
    .line 91
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 92
    .line 93
    .line 94
    iget p2, p0, La/nt8;->e:I

    .line 95
    .line 96
    or-int/lit8 p2, p2, 0x1

    .line 97
    .line 98
    invoke-static {p2}, La/x8x;->L(I)I

    .line 99
    .line 100
    .line 101
    move-result p2

    .line 102
    iget-object v0, p0, La/nt8;->b:La/mm40;

    .line 103
    .line 104
    iget-object v1, p0, La/nt8;->c:Ljava/util/List;

    .line 105
    .line 106
    iget-object p0, p0, La/nt8;->d:Lkotlin/jvm/functions/Function1;

    .line 107
    .line 108
    invoke-static {p2, p1, v0, v1, p0}, La/y860;->o(ILa/fet;La/mm40;Ljava/util/List;Lkotlin/jvm/functions/Function1;)V

    .line 109
    .line 110
    .line 111
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 112
    .line 113
    return-object p0

    .line 114
    :pswitch_3
    move-object v4, p1

    .line 115
    check-cast v4, La/fet;

    .line 116
    .line 117
    check-cast p2, Ljava/lang/Integer;

    .line 118
    .line 119
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 120
    .line 121
    .line 122
    const/4 p1, 0x1

    .line 123
    invoke-static {p1}, La/x8x;->L(I)I

    .line 124
    .line 125
    .line 126
    move-result v5

    .line 127
    iget-object v0, p0, La/nt8;->b:La/mm40;

    .line 128
    .line 129
    iget-object v1, p0, La/nt8;->c:Ljava/util/List;

    .line 130
    .line 131
    iget v2, p0, La/nt8;->e:I

    .line 132
    .line 133
    iget-object v3, p0, La/nt8;->d:Lkotlin/jvm/functions/Function1;

    .line 134
    .line 135
    invoke-static/range {v0 .. v5}, La/aad;->g(La/mm40;Ljava/util/List;ILkotlin/jvm/functions/Function1;La/fet;I)V

    .line 136
    .line 137
    .line 138
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 139
    .line 140
    return-object p0

    .line 141
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
