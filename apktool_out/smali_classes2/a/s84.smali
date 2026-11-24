.class public final synthetic La/s84;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/mm40;

.field public final synthetic c:B

.field public final synthetic d:Z


# direct methods
.method public synthetic constructor <init>(IILa/mm40;Z)V
    .locals 0

    .line 1
    const/4 p1, 0x0

    iput-byte p1, p0, La/s84;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p3, p0, La/s84;->b:La/mm40;

    iput-boolean p4, p0, La/s84;->d:Z

    iput-byte p2, p0, La/s84;->c:B

    return-void
.end method

.method public synthetic constructor <init>(La/mm40;IIB)V
    .locals 0

    .line 2
    iput-byte p4, p0, La/s84;->a:B

    iput-object p1, p0, La/s84;->b:La/mm40;

    iput-byte p2, p0, La/s84;->c:B

    iput-boolean p3, p0, La/s84;->d:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(ZLa/mm40;IB)V
    .locals 0

    .line 3
    iput-byte p4, p0, La/s84;->a:B

    iput-boolean p1, p0, La/s84;->d:Z

    iput-object p2, p0, La/s84;->b:La/mm40;

    iput-byte p3, p0, La/s84;->c:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-byte v0, p0, La/s84;->a:B

    .line 2
    .line 3
    check-cast p1, La/fet;

    .line 4
    .line 5
    check-cast p2, Ljava/lang/Integer;

    .line 6
    .line 7
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    packed-switch v0, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    iget-byte p2, p0, La/s84;->c:B

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
    iget-boolean v0, p0, La/s84;->d:Z

    .line 22
    .line 23
    iget-object p0, p0, La/s84;->b:La/mm40;

    .line 24
    .line 25
    invoke-static {p2, v0, p1, p0}, La/v2n0;->g(IILa/fet;La/mm40;)V

    .line 26
    .line 27
    .line 28
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 29
    .line 30
    return-object p0

    .line 31
    :pswitch_0
    iget-byte p2, p0, La/s84;->c:B

    .line 32
    .line 33
    or-int/lit8 p2, p2, 0x1

    .line 34
    .line 35
    invoke-static {p2}, La/x8x;->L(I)I

    .line 36
    .line 37
    .line 38
    move-result p2

    .line 39
    iget-object v0, p0, La/s84;->b:La/mm40;

    .line 40
    .line 41
    iget-boolean p0, p0, La/s84;->d:Z

    .line 42
    .line 43
    invoke-static {p2, p1, v0, p0}, La/rsr0;->I(ILa/fet;La/mm40;Z)V

    .line 44
    .line 45
    .line 46
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 47
    .line 48
    return-object p0

    .line 49
    :pswitch_1
    iget-byte p2, p0, La/s84;->c:B

    .line 50
    .line 51
    or-int/lit8 p2, p2, 0x1

    .line 52
    .line 53
    invoke-static {p2}, La/x8x;->L(I)I

    .line 54
    .line 55
    .line 56
    move-result p2

    .line 57
    iget-object v0, p0, La/s84;->b:La/mm40;

    .line 58
    .line 59
    iget-boolean p0, p0, La/s84;->d:Z

    .line 60
    .line 61
    invoke-static {p2, p1, v0, p0}, La/bsr0;->H(ILa/fet;La/mm40;Z)V

    .line 62
    .line 63
    .line 64
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 65
    .line 66
    return-object p0

    .line 67
    :pswitch_2
    iget-byte p2, p0, La/s84;->c:B

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
    iget-object v0, p0, La/s84;->b:La/mm40;

    .line 76
    .line 77
    iget-boolean p0, p0, La/s84;->d:Z

    .line 78
    .line 79
    invoke-static {p2, p1, v0, p0}, La/rsr0;->I(ILa/fet;La/mm40;Z)V

    .line 80
    .line 81
    .line 82
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 83
    .line 84
    return-object p0

    .line 85
    :pswitch_3
    iget-byte p2, p0, La/s84;->c:B

    .line 86
    .line 87
    or-int/lit8 p2, p2, 0x1

    .line 88
    .line 89
    invoke-static {p2}, La/x8x;->L(I)I

    .line 90
    .line 91
    .line 92
    move-result p2

    .line 93
    iget-object v0, p0, La/s84;->b:La/mm40;

    .line 94
    .line 95
    iget-boolean p0, p0, La/s84;->d:Z

    .line 96
    .line 97
    invoke-static {p2, p1, v0, p0}, La/bsr0;->H(ILa/fet;La/mm40;Z)V

    .line 98
    .line 99
    .line 100
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 101
    .line 102
    return-object p0

    .line 103
    :pswitch_4
    iget-byte p2, p0, La/s84;->c:B

    .line 104
    .line 105
    or-int/lit8 p2, p2, 0x1

    .line 106
    .line 107
    invoke-static {p2}, La/x8x;->L(I)I

    .line 108
    .line 109
    .line 110
    move-result p2

    .line 111
    iget-boolean v0, p0, La/s84;->d:Z

    .line 112
    .line 113
    iget-object p0, p0, La/s84;->b:La/mm40;

    .line 114
    .line 115
    invoke-static {p2, v0, p1, p0}, La/nnw0;->s(IILa/fet;La/mm40;)V

    .line 116
    .line 117
    .line 118
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 119
    .line 120
    return-object p0

    .line 121
    :pswitch_5
    iget-byte p2, p0, La/s84;->c:B

    .line 122
    .line 123
    or-int/lit8 p2, p2, 0x1

    .line 124
    .line 125
    invoke-static {p2}, La/x8x;->L(I)I

    .line 126
    .line 127
    .line 128
    move-result p2

    .line 129
    iget-boolean v0, p0, La/s84;->d:Z

    .line 130
    .line 131
    iget-object p0, p0, La/s84;->b:La/mm40;

    .line 132
    .line 133
    invoke-static {p2, v0, p1, p0}, La/uzb;->B(IILa/fet;La/mm40;)V

    .line 134
    .line 135
    .line 136
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 137
    .line 138
    return-object p0

    .line 139
    :pswitch_6
    iget-byte p2, p0, La/s84;->c:B

    .line 140
    .line 141
    or-int/lit8 p2, p2, 0x1

    .line 142
    .line 143
    invoke-static {p2}, La/x8x;->L(I)I

    .line 144
    .line 145
    .line 146
    move-result p2

    .line 147
    iget-boolean v0, p0, La/s84;->d:Z

    .line 148
    .line 149
    iget-object p0, p0, La/s84;->b:La/mm40;

    .line 150
    .line 151
    invoke-static {p2, v0, p1, p0}, La/bsr0;->j(IILa/fet;La/mm40;)V

    .line 152
    .line 153
    .line 154
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 155
    .line 156
    return-object p0

    .line 157
    :pswitch_7
    const/4 p2, 0x1

    .line 158
    invoke-static {p2}, La/x8x;->L(I)I

    .line 159
    .line 160
    .line 161
    move-result p2

    .line 162
    iget-object v0, p0, La/s84;->b:La/mm40;

    .line 163
    .line 164
    iget-boolean v1, p0, La/s84;->d:Z

    .line 165
    .line 166
    iget-byte p0, p0, La/s84;->c:B

    .line 167
    .line 168
    invoke-static {v0, v1, p1, p2, p0}, La/eeq;->g(La/mm40;ZLa/fet;II)V

    .line 169
    .line 170
    .line 171
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 172
    .line 173
    return-object p0

    .line 174
    nop

    .line 175
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
