.class public final synthetic La/e6n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:I


# direct methods
.method public synthetic constructor <init>(BILjava/lang/String;)V
    .locals 0

    .line 2
    iput-byte p1, p0, La/e6n;->a:B

    iput-object p3, p0, La/e6n;->b:Ljava/lang/String;

    iput p2, p0, La/e6n;->c:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;)V
    .locals 1

    .line 1
    const/4 v0, 0x4

    iput-byte v0, p0, La/e6n;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, La/e6n;->c:I

    iput-object p2, p0, La/e6n;->b:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 1
    iget-byte v0, p0, La/e6n;->a:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x2

    .line 5
    const/4 v3, 0x1

    .line 6
    iget-object v4, p0, La/e6n;->b:Ljava/lang/String;

    .line 7
    .line 8
    iget p0, p0, La/e6n;->c:I

    .line 9
    .line 10
    packed-switch v0, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    check-cast p1, La/qpg0;

    .line 14
    .line 15
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    const-string v0, "UPDATE workspec SET stop_reason=? WHERE id=?"

    .line 19
    .line 20
    invoke-interface {p1, v0}, La/qpg0;->Z0(Ljava/lang/String;)La/xpg0;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    int-to-long v0, p0

    .line 25
    :try_start_0
    invoke-interface {p1, v3, v0, v1}, La/xpg0;->o(IJ)V

    .line 26
    .line 27
    .line 28
    invoke-interface {p1, v2, v4}, La/xpg0;->z(ILjava/lang/String;)V

    .line 29
    .line 30
    .line 31
    invoke-interface {p1}, La/xpg0;->W0()Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 32
    .line 33
    .line 34
    invoke-interface {p1}, Ljava/lang/AutoCloseable;->close()V

    .line 35
    .line 36
    .line 37
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 38
    .line 39
    return-object p0

    .line 40
    :catchall_0
    move-exception p0

    .line 41
    invoke-interface {p1}, Ljava/lang/AutoCloseable;->close()V

    .line 42
    .line 43
    .line 44
    throw p0

    .line 45
    :pswitch_0
    check-cast p1, La/qpg0;

    .line 46
    .line 47
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 48
    .line 49
    .line 50
    const-string v0, "UPDATE workspec SET next_schedule_time_override=9223372036854775807 WHERE (id=? AND next_schedule_time_override_generation=?)"

    .line 51
    .line 52
    invoke-interface {p1, v0}, La/qpg0;->Z0(Ljava/lang/String;)La/xpg0;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    :try_start_1
    invoke-interface {p1, v3, v4}, La/xpg0;->z(ILjava/lang/String;)V

    .line 57
    .line 58
    .line 59
    int-to-long v0, p0

    .line 60
    invoke-interface {p1, v2, v0, v1}, La/xpg0;->o(IJ)V

    .line 61
    .line 62
    .line 63
    invoke-interface {p1}, La/xpg0;->W0()Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 64
    .line 65
    .line 66
    invoke-interface {p1}, Ljava/lang/AutoCloseable;->close()V

    .line 67
    .line 68
    .line 69
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 70
    .line 71
    return-object p0

    .line 72
    :catchall_1
    move-exception p0

    .line 73
    invoke-interface {p1}, Ljava/lang/AutoCloseable;->close()V

    .line 74
    .line 75
    .line 76
    throw p0

    .line 77
    :pswitch_1
    check-cast p1, La/qpg0;

    .line 78
    .line 79
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 80
    .line 81
    .line 82
    const-string v0, "SELECT * FROM SystemIdInfo WHERE work_spec_id=? AND generation=?"

    .line 83
    .line 84
    invoke-interface {p1, v0}, La/qpg0;->Z0(Ljava/lang/String;)La/xpg0;

    .line 85
    .line 86
    .line 87
    move-result-object p1

    .line 88
    :try_start_2
    invoke-interface {p1, v3, v4}, La/xpg0;->z(ILjava/lang/String;)V

    .line 89
    .line 90
    .line 91
    int-to-long v3, p0

    .line 92
    invoke-interface {p1, v2, v3, v4}, La/xpg0;->o(IJ)V

    .line 93
    .line 94
    .line 95
    const-string p0, "work_spec_id"

    .line 96
    .line 97
    invoke-static {p1, p0}, La/g1x;->t(La/xpg0;Ljava/lang/String;)I

    .line 98
    .line 99
    .line 100
    move-result p0

    .line 101
    const-string v0, "generation"

    .line 102
    .line 103
    invoke-static {p1, v0}, La/g1x;->t(La/xpg0;Ljava/lang/String;)I

    .line 104
    .line 105
    .line 106
    move-result v0

    .line 107
    const-string v2, "system_id"

    .line 108
    .line 109
    invoke-static {p1, v2}, La/g1x;->t(La/xpg0;Ljava/lang/String;)I

    .line 110
    .line 111
    .line 112
    move-result v2

    .line 113
    invoke-interface {p1}, La/xpg0;->W0()Z

    .line 114
    .line 115
    .line 116
    move-result v3

    .line 117
    if-eqz v3, :cond_0

    .line 118
    .line 119
    invoke-interface {p1, p0}, La/xpg0;->J0(I)Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    move-result-object p0

    .line 123
    invoke-interface {p1, v0}, La/xpg0;->getLong(I)J

    .line 124
    .line 125
    .line 126
    move-result-wide v0

    .line 127
    long-to-int v0, v0

    .line 128
    invoke-interface {p1, v2}, La/xpg0;->getLong(I)J

    .line 129
    .line 130
    .line 131
    move-result-wide v1

    .line 132
    long-to-int v1, v1

    .line 133
    new-instance v2, La/r9o0;

    .line 134
    .line 135
    invoke-direct {v2, p0, v0, v1}, La/r9o0;-><init>(Ljava/lang/String;II)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 136
    .line 137
    .line 138
    move-object v1, v2

    .line 139
    goto :goto_0

    .line 140
    :catchall_2
    move-exception p0

    .line 141
    goto :goto_1

    .line 142
    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/lang/AutoCloseable;->close()V

    .line 143
    .line 144
    .line 145
    return-object v1

    .line 146
    :goto_1
    invoke-interface {p1}, Ljava/lang/AutoCloseable;->close()V

    .line 147
    .line 148
    .line 149
    throw p0

    .line 150
    :pswitch_2
    check-cast p1, Lorg/xplatform/uikit/components/tag/DsTag;

    .line 151
    .line 152
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 153
    .line 154
    .line 155
    invoke-virtual {p1, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 156
    .line 157
    .line 158
    invoke-virtual {p1, p0}, Lorg/xplatform/uikit/components/tag/DsTag;->setStyle(I)V

    .line 159
    .line 160
    .line 161
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 162
    .line 163
    return-object p0

    .line 164
    :pswitch_3
    check-cast p1, Landroid/content/Context;

    .line 165
    .line 166
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 167
    .line 168
    .line 169
    new-instance v0, Lorg/xplatform/uikit/components/tag/DsTag;

    .line 170
    .line 171
    const/4 v2, 0x6

    .line 172
    const/4 v3, 0x0

    .line 173
    invoke-direct {v0, p1, v1, v2, v3}, Lorg/xplatform/uikit/components/tag/DsTag;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    .line 174
    .line 175
    .line 176
    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 177
    .line 178
    .line 179
    invoke-virtual {v0, p0}, Lorg/xplatform/uikit/components/tag/DsTag;->setStyle(I)V

    .line 180
    .line 181
    .line 182
    return-object v0

    .line 183
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
