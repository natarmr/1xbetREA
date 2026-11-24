.class public final synthetic La/sk1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/bzt;


# direct methods
.method public synthetic constructor <init>(La/bzt;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/sk1;->a:B

    iput-object p1, p0, La/sk1;->b:La/bzt;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 13

    .line 1
    iget-byte v0, p0, La/sk1;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/sk1;->b:La/bzt;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v1, La/ws50;

    .line 9
    .line 10
    new-instance v4, La/xyq0;

    .line 11
    .line 12
    const/4 v0, 0x1

    .line 13
    const/4 v2, 0x0

    .line 14
    invoke-direct {v4, v0, v0, v2}, La/xyq0;-><init>(ZZZ)V

    .line 15
    .line 16
    .line 17
    sget-object v5, La/iun;->a:La/iun;

    .line 18
    .line 19
    iget-object p0, p0, La/bzt;->a:La/fsd;

    .line 20
    .line 21
    invoke-virtual {p0}, La/fsd;->a()La/v8d;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    iget v7, p0, La/v8d;->r:I

    .line 26
    .line 27
    const/4 v8, 0x0

    .line 28
    const/4 v2, 0x1

    .line 29
    const/4 v3, 0x0

    .line 30
    move-object v6, v5

    .line 31
    invoke-direct/range {v1 .. v8}, La/ws50;-><init>(ZILa/xyq0;Ljava/util/List;Ljava/util/List;ILa/mdm;)V

    .line 32
    .line 33
    .line 34
    return-object v1

    .line 35
    :pswitch_0
    new-instance v2, La/gr50;

    .line 36
    .line 37
    sget-object v5, La/iun;->a:La/iun;

    .line 38
    .line 39
    iget-object p0, p0, La/bzt;->a:La/fsd;

    .line 40
    .line 41
    invoke-virtual {p0}, La/fsd;->a()La/v8d;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    iget v7, p0, La/v8d;->r:I

    .line 46
    .line 47
    const/4 v8, 0x0

    .line 48
    const/4 v3, 0x1

    .line 49
    const/4 v4, 0x0

    .line 50
    move-object v6, v5

    .line 51
    invoke-direct/range {v2 .. v8}, La/gr50;-><init>(ZILjava/util/List;Ljava/util/List;ILa/mdm;)V

    .line 52
    .line 53
    .line 54
    return-object v2

    .line 55
    :pswitch_1
    sget-object v5, La/iun;->a:La/iun;

    .line 56
    .line 57
    iget-object p0, p0, La/bzt;->a:La/fsd;

    .line 58
    .line 59
    invoke-virtual {p0}, La/fsd;->a()La/v8d;

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    iget v7, p0, La/v8d;->r:I

    .line 64
    .line 65
    new-instance v3, La/iq50;

    .line 66
    .line 67
    const/4 v4, 0x1

    .line 68
    const/4 v8, 0x0

    .line 69
    move-object v6, v5

    .line 70
    invoke-direct/range {v3 .. v8}, La/iq50;-><init>(ZLjava/util/List;Ljava/util/List;ILa/mdm;)V

    .line 71
    .line 72
    .line 73
    return-object v3

    .line 74
    :pswitch_2
    sget-object v6, La/iun;->a:La/iun;

    .line 75
    .line 76
    iget-object p0, p0, La/bzt;->a:La/fsd;

    .line 77
    .line 78
    invoke-virtual {p0}, La/fsd;->a()La/v8d;

    .line 79
    .line 80
    .line 81
    move-result-object p0

    .line 82
    iget v8, p0, La/v8d;->r:I

    .line 83
    .line 84
    new-instance v4, La/np50;

    .line 85
    .line 86
    const/4 v5, 0x1

    .line 87
    const/4 v9, 0x0

    .line 88
    move-object v7, v6

    .line 89
    invoke-direct/range {v4 .. v9}, La/np50;-><init>(ZLjava/util/List;Ljava/util/List;ILa/mdm;)V

    .line 90
    .line 91
    .line 92
    return-object v4

    .line 93
    :pswitch_3
    sget-object v9, La/iun;->a:La/iun;

    .line 94
    .line 95
    iget-object p0, p0, La/bzt;->a:La/fsd;

    .line 96
    .line 97
    invoke-virtual {p0}, La/fsd;->a()La/v8d;

    .line 98
    .line 99
    .line 100
    move-result-object p0

    .line 101
    iget v11, p0, La/v8d;->r:I

    .line 102
    .line 103
    new-instance v5, La/yo50;

    .line 104
    .line 105
    const/4 v8, 0x1

    .line 106
    const/4 v12, 0x0

    .line 107
    const/4 v6, 0x1

    .line 108
    const/4 v7, 0x0

    .line 109
    move-object v10, v9

    .line 110
    invoke-direct/range {v5 .. v12}, La/yo50;-><init>(ZIZLjava/util/List;Ljava/util/List;ILa/mdm;)V

    .line 111
    .line 112
    .line 113
    return-object v5

    .line 114
    :pswitch_4
    new-instance v0, La/jw8;

    .line 115
    .line 116
    iget-object p0, p0, La/bzt;->a:La/fsd;

    .line 117
    .line 118
    invoke-virtual {p0}, La/fsd;->a()La/v8d;

    .line 119
    .line 120
    .line 121
    move-result-object p0

    .line 122
    iget p0, p0, La/v8d;->r:I

    .line 123
    .line 124
    sget-object v1, La/tx8;->a:La/tx8;

    .line 125
    .line 126
    sget-object v2, La/ww8;->a:La/ww8;

    .line 127
    .line 128
    invoke-direct {v0, v1, v2, p0}, La/jw8;-><init>(La/ux8;La/xw8;I)V

    .line 129
    .line 130
    .line 131
    return-object v0

    .line 132
    :pswitch_5
    iget-object p0, p0, La/bzt;->a:La/fsd;

    .line 133
    .line 134
    invoke-virtual {p0}, La/fsd;->a()La/v8d;

    .line 135
    .line 136
    .line 137
    move-result-object p0

    .line 138
    return-object p0

    .line 139
    :pswitch_6
    new-instance v0, La/ok1;

    .line 140
    .line 141
    iget-object p0, p0, La/bzt;->a:La/fsd;

    .line 142
    .line 143
    invoke-virtual {p0}, La/fsd;->a()La/v8d;

    .line 144
    .line 145
    .line 146
    move-result-object p0

    .line 147
    iget v1, p0, La/v8d;->r:I

    .line 148
    .line 149
    sget-object v2, La/iun;->a:La/iun;

    .line 150
    .line 151
    const/4 v4, 0x0

    .line 152
    const/4 v5, 0x0

    .line 153
    const/4 v3, 0x0

    .line 154
    invoke-direct/range {v0 .. v5}, La/ok1;-><init>(ILjava/util/List;ZZZ)V

    .line 155
    .line 156
    .line 157
    return-object v0

    .line 158
    nop

    .line 159
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
