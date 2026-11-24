.class public final synthetic La/nf2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/pru;

.field public final synthetic c:La/vzg0;


# direct methods
.method public synthetic constructor <init>(La/pru;La/vzg0;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/nf2;->a:B

    iput-object p1, p0, La/nf2;->b:La/pru;

    iput-object p2, p0, La/nf2;->c:La/vzg0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 12

    .line 1
    iget-byte v0, p0, La/nf2;->a:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object v2, p0, La/nf2;->c:La/vzg0;

    .line 5
    .line 6
    iget-object p0, p0, La/nf2;->b:La/pru;

    .line 7
    .line 8
    packed-switch v0, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, La/pru;->a()La/sff0;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    iget-object p0, p0, La/sff0;->N:La/co4;

    .line 16
    .line 17
    iget-boolean v4, p0, La/co4;->c:Z

    .line 18
    .line 19
    const-string p0, "KEY_ENTER_PHONE_CODE_BY_MANUALLY"

    .line 20
    .line 21
    invoke-virtual {v2, p0}, La/vzg0;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    check-cast p0, Ljava/lang/Boolean;

    .line 26
    .line 27
    if-eqz p0, :cond_0

    .line 28
    .line 29
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 30
    .line 31
    .line 32
    move-result p0

    .line 33
    move v6, p0

    .line 34
    goto :goto_0

    .line 35
    :cond_0
    move v6, v1

    .line 36
    :goto_0
    sget-object v8, La/iun;->a:La/iun;

    .line 37
    .line 38
    new-instance v5, La/zqp;

    .line 39
    .line 40
    const-string p0, "KEY_PHONE_CODE_BY_MANUALLY"

    .line 41
    .line 42
    invoke-virtual {v2, p0}, La/vzg0;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    check-cast p0, Ljava/lang/String;

    .line 47
    .line 48
    if-nez p0, :cond_1

    .line 49
    .line 50
    const-string p0, "+"

    .line 51
    .line 52
    :cond_1
    invoke-direct {v5, p0, v1}, La/zqp;-><init>(Ljava/lang/String;Z)V

    .line 53
    .line 54
    .line 55
    const-string p0, "KEY_SEARCH_VALUE"

    .line 56
    .line 57
    invoke-virtual {v2, p0}, La/vzg0;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    check-cast p0, Ljava/lang/String;

    .line 62
    .line 63
    if-nez p0, :cond_2

    .line 64
    .line 65
    const-string p0, ""

    .line 66
    .line 67
    :cond_2
    move-object v7, p0

    .line 68
    const-string p0, "KEY_CONTENT_VISIBILITY_STATUS"

    .line 69
    .line 70
    invoke-virtual {v2, p0}, La/vzg0;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object p0

    .line 74
    check-cast p0, Ljava/lang/Boolean;

    .line 75
    .line 76
    if-eqz p0, :cond_3

    .line 77
    .line 78
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 79
    .line 80
    .line 81
    move-result v1

    .line 82
    :cond_3
    move v9, v1

    .line 83
    new-instance v3, La/br90;

    .line 84
    .line 85
    invoke-direct/range {v3 .. v9}, La/br90;-><init>(ZLa/zqp;ZLjava/lang/String;Ljava/util/List;Z)V

    .line 86
    .line 87
    .line 88
    return-object v3

    .line 89
    :pswitch_0
    invoke-virtual {p0}, La/pru;->a()La/sff0;

    .line 90
    .line 91
    .line 92
    move-result-object p0

    .line 93
    const-string v0, "SELECTED_TAB_KEY"

    .line 94
    .line 95
    invoke-virtual {v2, v0}, La/vzg0;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object v0

    .line 99
    check-cast v0, La/b9g0;

    .line 100
    .line 101
    if-nez v0, :cond_4

    .line 102
    .line 103
    sget-object v0, La/b9g0;->b:La/b9g0;

    .line 104
    .line 105
    :cond_4
    move-object v4, v0

    .line 106
    const-string v0, "SEARCH_QUERY_MAP_KEY"

    .line 107
    .line 108
    invoke-virtual {v2, v0}, La/vzg0;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object v0

    .line 112
    check-cast v0, Ljava/util/Map;

    .line 113
    .line 114
    if-nez v0, :cond_5

    .line 115
    .line 116
    sget-object v0, La/lun;->a:La/lun;

    .line 117
    .line 118
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 119
    .line 120
    .line 121
    :cond_5
    move-object v8, v0

    .line 122
    const-string v0, "SHOW_MULTISELECT_KEY"

    .line 123
    .line 124
    invoke-virtual {v2, v0}, La/vzg0;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    move-result-object v0

    .line 128
    check-cast v0, Ljava/lang/Boolean;

    .line 129
    .line 130
    if-eqz v0, :cond_6

    .line 131
    .line 132
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 133
    .line 134
    .line 135
    move-result v1

    .line 136
    :cond_6
    move v10, v1

    .line 137
    iget-object p0, p0, La/sff0;->g:La/mum0;

    .line 138
    .line 139
    iget-object v7, p0, La/mum0;->x:La/zvh0;

    .line 140
    .line 141
    iget-object v5, p0, La/mum0;->v:La/h8l0;

    .line 142
    .line 143
    iget-object v6, p0, La/mum0;->p:La/i8l0;

    .line 144
    .line 145
    const-string p0, "CHOOSEN_DATE_KEY"

    .line 146
    .line 147
    invoke-virtual {v2, p0}, La/vzg0;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 148
    .line 149
    .line 150
    move-result-object p0

    .line 151
    move-object v11, p0

    .line 152
    check-cast v11, Ljava/util/Calendar;

    .line 153
    .line 154
    new-instance v3, La/jf2;

    .line 155
    .line 156
    const/4 v9, 0x0

    .line 157
    invoke-direct/range {v3 .. v11}, La/jf2;-><init>(La/b9g0;La/h8l0;La/i8l0;La/zvh0;Ljava/util/Map;ZZLjava/util/Calendar;)V

    .line 158
    .line 159
    .line 160
    return-object v3

    .line 161
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
