.class public final La/xme0;
.super La/mb00;
.source "SourceFile"


# instance fields
.field public final synthetic c:B

.field public final d:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/xme0;->c:B

    iput-object p1, p0, La/xme0;->d:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final b(La/j;Ljava/lang/String;)La/lb00;
    .locals 5

    .line 1
    iget-byte v0, p0, La/xme0;->c:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object p0, p0, La/xme0;->d:Ljava/lang/Object;

    .line 5
    .line 6
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    check-cast p0, La/mb00;

    .line 13
    .line 14
    invoke-virtual {p0, p1, p2}, La/mb00;->b(La/j;Ljava/lang/String;)La/lb00;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    if-eqz p0, :cond_0

    .line 19
    .line 20
    iget-object p1, p0, La/lb00;->b:Ljava/lang/CharSequence;

    .line 21
    .line 22
    invoke-static {p1}, La/y1w0;->a(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    iget-object p2, p0, La/lb00;->a:La/j;

    .line 27
    .line 28
    iget-object p0, p0, La/lb00;->c:Ljava/lang/CharSequence;

    .line 29
    .line 30
    new-instance v1, La/lb00;

    .line 31
    .line 32
    invoke-direct {v1, p2, p1, p0}, La/lb00;-><init>(La/j;Ljava/lang/CharSequence;Ljava/lang/CharSequence;)V

    .line 33
    .line 34
    .line 35
    :cond_0
    return-object v1

    .line 36
    :pswitch_0
    invoke-virtual {p1}, La/j;->a()Ljava/util/List;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 45
    .line 46
    .line 47
    move-result v2

    .line 48
    if-eqz v2, :cond_2

    .line 49
    .line 50
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v2

    .line 54
    move-object v3, v2

    .line 55
    check-cast v3, La/j;

    .line 56
    .line 57
    iget-object v3, v3, La/j;->a:La/ar20;

    .line 58
    .line 59
    sget-object v4, La/wb;->z:La/ar20;

    .line 60
    .line 61
    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    move-result v3

    .line 65
    if-eqz v3, :cond_1

    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_2
    move-object v2, v1

    .line 69
    :goto_0
    check-cast v2, La/j;

    .line 70
    .line 71
    if-nez v2, :cond_3

    .line 72
    .line 73
    goto :goto_3

    .line 74
    :cond_3
    check-cast p0, La/pb00;

    .line 75
    .line 76
    invoke-static {v2, p2}, La/dwi0;->N(La/j;Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 77
    .line 78
    .line 79
    move-result-object p2

    .line 80
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 81
    .line 82
    .line 83
    iget-object p0, p0, La/pb00;->a:Ljava/util/HashMap;

    .line 84
    .line 85
    sget-object v0, La/pb00;->b:Lkotlin/text/Regex;

    .line 86
    .line 87
    const-string v3, " "

    .line 88
    .line 89
    invoke-virtual {v0, p2, v3}, Lkotlin/text/Regex;->replace(Ljava/lang/CharSequence;Ljava/lang/String;)Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object p2

    .line 93
    sget-object v0, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 94
    .line 95
    invoke-virtual {p2, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object p2

    .line 99
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 100
    .line 101
    .line 102
    invoke-virtual {p0, p2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object p0

    .line 106
    check-cast p0, La/ob00;

    .line 107
    .line 108
    if-nez p0, :cond_4

    .line 109
    .line 110
    goto :goto_3

    .line 111
    :cond_4
    invoke-virtual {p1}, La/j;->a()Ljava/util/List;

    .line 112
    .line 113
    .line 114
    move-result-object p1

    .line 115
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 116
    .line 117
    .line 118
    move-result-object p1

    .line 119
    :cond_5
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 120
    .line 121
    .line 122
    move-result p2

    .line 123
    if-eqz p2, :cond_6

    .line 124
    .line 125
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    move-result-object p2

    .line 129
    move-object v0, p2

    .line 130
    check-cast v0, La/j;

    .line 131
    .line 132
    iget-object v0, v0, La/j;->a:La/ar20;

    .line 133
    .line 134
    sget-object v3, La/wb;->C:La/ar20;

    .line 135
    .line 136
    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 137
    .line 138
    .line 139
    move-result v0

    .line 140
    if-eqz v0, :cond_5

    .line 141
    .line 142
    goto :goto_1

    .line 143
    :cond_6
    move-object p2, v1

    .line 144
    :goto_1
    check-cast p2, La/j;

    .line 145
    .line 146
    if-nez p2, :cond_7

    .line 147
    .line 148
    goto :goto_2

    .line 149
    :cond_7
    move-object v2, p2

    .line 150
    :goto_2
    sget-object p1, La/tzn;->a:Ljava/util/Map;

    .line 151
    .line 152
    iget-object p1, p0, La/ob00;->b:Ljava/lang/String;

    .line 153
    .line 154
    const/4 p2, 0x1

    .line 155
    invoke-static {p1, p2, p2}, La/tzn;->a(Ljava/lang/CharSequence;ZZ)Ljava/lang/String;

    .line 156
    .line 157
    .line 158
    move-result-object p1

    .line 159
    iget-object p0, p0, La/ob00;->c:Ljava/lang/CharSequence;

    .line 160
    .line 161
    if-eqz p0, :cond_8

    .line 162
    .line 163
    invoke-static {p0, p2, p2}, La/tzn;->a(Ljava/lang/CharSequence;ZZ)Ljava/lang/String;

    .line 164
    .line 165
    .line 166
    move-result-object v1

    .line 167
    :cond_8
    new-instance p0, La/lb00;

    .line 168
    .line 169
    invoke-direct {p0, v2, p1, v1}, La/lb00;-><init>(La/j;Ljava/lang/CharSequence;Ljava/lang/CharSequence;)V

    .line 170
    .line 171
    .line 172
    move-object v1, p0

    .line 173
    :goto_3
    return-object v1

    .line 174
    nop

    .line 175
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public d(La/htw;Ljava/lang/String;La/j;La/lb00;)V
    .locals 1

    .line 1
    iget-byte v0, p0, La/xme0;->c:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1, p2, p3, p4}, La/mb00;->d(La/htw;Ljava/lang/String;La/j;La/lb00;)V

    .line 7
    .line 8
    .line 9
    return-void

    .line 10
    :pswitch_0
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    iget-object p0, p0, La/xme0;->d:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast p0, La/mb00;

    .line 16
    .line 17
    invoke-virtual {p0, p1, p2, p3, p4}, La/mb00;->d(La/htw;Ljava/lang/String;La/j;La/lb00;)V

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method
