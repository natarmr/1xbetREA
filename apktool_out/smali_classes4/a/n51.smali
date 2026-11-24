.class public final synthetic La/n51;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/e900;


# direct methods
.method public synthetic constructor <init>(La/e900;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/n51;->a:B

    iput-object p1, p0, La/n51;->b:La/e900;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    iget-byte v0, p0, La/n51;->a:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, La/hcz;

    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    new-instance v0, La/gcn0;

    .line 12
    .line 13
    iget-object p0, p0, La/n51;->b:La/e900;

    .line 14
    .line 15
    const/4 v1, 0x1

    .line 16
    invoke-direct {v0, p0, v1}, La/gcn0;-><init>(Ljava/lang/Object;B)V

    .line 17
    .line 18
    .line 19
    new-instance p0, La/ugd;

    .line 20
    .line 21
    const v2, 0x20708190

    .line 22
    .line 23
    .line 24
    invoke-direct {p0, v2, v1, v0}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    const/4 v0, 0x3

    .line 28
    const/4 v1, 0x0

    .line 29
    invoke-static {p1, v1, v1, p0, v0}, La/hcz;->e(La/hcz;Ljava/lang/String;La/sgy;La/xdr;I)V

    .line 30
    .line 31
    .line 32
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 33
    .line 34
    return-object p0

    .line 35
    :pswitch_0
    move-object v0, p1

    .line 36
    check-cast v0, La/fhl;

    .line 37
    .line 38
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    const/4 v9, 0x0

    .line 42
    const/16 v10, 0x7e

    .line 43
    .line 44
    iget-object v1, p0, La/n51;->b:La/e900;

    .line 45
    .line 46
    const-wide/16 v2, 0x0

    .line 47
    .line 48
    const-wide/16 v4, 0x0

    .line 49
    .line 50
    const/4 v6, 0x0

    .line 51
    const/4 v7, 0x0

    .line 52
    const/4 v8, 0x0

    .line 53
    invoke-static/range {v0 .. v10}, La/fhl;->r(La/fhl;La/t89;JJFLa/agc;La/a4d;II)V

    .line 54
    .line 55
    .line 56
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 57
    .line 58
    return-object p0

    .line 59
    :pswitch_1
    move-object v0, p1

    .line 60
    check-cast v0, La/fhl;

    .line 61
    .line 62
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 63
    .line 64
    .line 65
    const/4 v9, 0x0

    .line 66
    const/16 v10, 0x7e

    .line 67
    .line 68
    iget-object v1, p0, La/n51;->b:La/e900;

    .line 69
    .line 70
    const-wide/16 v2, 0x0

    .line 71
    .line 72
    const-wide/16 v4, 0x0

    .line 73
    .line 74
    const/4 v6, 0x0

    .line 75
    const/4 v7, 0x0

    .line 76
    const/4 v8, 0x0

    .line 77
    invoke-static/range {v0 .. v10}, La/fhl;->r(La/fhl;La/t89;JJFLa/agc;La/a4d;II)V

    .line 78
    .line 79
    .line 80
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 81
    .line 82
    return-object p0

    .line 83
    :pswitch_2
    move-object v0, p1

    .line 84
    check-cast v0, La/g7z;

    .line 85
    .line 86
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 87
    .line 88
    .line 89
    const/4 v9, 0x0

    .line 90
    const/16 v10, 0x7e

    .line 91
    .line 92
    iget-object v1, p0, La/n51;->b:La/e900;

    .line 93
    .line 94
    const-wide/16 v2, 0x0

    .line 95
    .line 96
    const-wide/16 v4, 0x0

    .line 97
    .line 98
    const/4 v6, 0x0

    .line 99
    const/4 v7, 0x0

    .line 100
    const/4 v8, 0x0

    .line 101
    invoke-static/range {v0 .. v10}, La/fhl;->r(La/fhl;La/t89;JJFLa/agc;La/a4d;II)V

    .line 102
    .line 103
    .line 104
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 105
    .line 106
    return-object p0

    .line 107
    :pswitch_3
    move-object v0, p1

    .line 108
    check-cast v0, La/fhl;

    .line 109
    .line 110
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 111
    .line 112
    .line 113
    const/4 v9, 0x0

    .line 114
    const/16 v10, 0x7e

    .line 115
    .line 116
    iget-object v1, p0, La/n51;->b:La/e900;

    .line 117
    .line 118
    const-wide/16 v2, 0x0

    .line 119
    .line 120
    const-wide/16 v4, 0x0

    .line 121
    .line 122
    const/4 v6, 0x0

    .line 123
    const/4 v7, 0x0

    .line 124
    const/4 v8, 0x0

    .line 125
    invoke-static/range {v0 .. v10}, La/fhl;->r(La/fhl;La/t89;JJFLa/agc;La/a4d;II)V

    .line 126
    .line 127
    .line 128
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 129
    .line 130
    return-object p0

    .line 131
    :pswitch_4
    move-object v0, p1

    .line 132
    check-cast v0, La/fhl;

    .line 133
    .line 134
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 135
    .line 136
    .line 137
    const/4 v9, 0x0

    .line 138
    const/16 v10, 0x7e

    .line 139
    .line 140
    iget-object v1, p0, La/n51;->b:La/e900;

    .line 141
    .line 142
    const-wide/16 v2, 0x0

    .line 143
    .line 144
    const-wide/16 v4, 0x0

    .line 145
    .line 146
    const/4 v6, 0x0

    .line 147
    const/4 v7, 0x0

    .line 148
    const/4 v8, 0x0

    .line 149
    invoke-static/range {v0 .. v10}, La/fhl;->r(La/fhl;La/t89;JJFLa/agc;La/a4d;II)V

    .line 150
    .line 151
    .line 152
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 153
    .line 154
    return-object p0

    .line 155
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
