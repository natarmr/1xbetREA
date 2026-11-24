.class public final synthetic La/j7e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/v8e;


# direct methods
.method public synthetic constructor <init>(La/v8e;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/j7e;->a:B

    iput-object p1, p0, La/j7e;->b:La/v8e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 4

    .line 1
    iget-byte v0, p0, La/j7e;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/j7e;->b:La/v8e;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, Lokhttp3/OkHttpClient$Builder;

    .line 9
    .line 10
    invoke-direct {v0}, Lokhttp3/OkHttpClient$Builder;-><init>()V

    .line 11
    .line 12
    .line 13
    new-instance v1, Lokhttp3/OkHttpClient;

    .line 14
    .line 15
    invoke-direct {v1, v0}, Lokhttp3/OkHttpClient;-><init>(Lokhttp3/OkHttpClient$Builder;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v1}, Lokhttp3/OkHttpClient;->b()Lokhttp3/OkHttpClient$Builder;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    iget-object v1, p0, La/v8e;->e:La/eii0;

    .line 23
    .line 24
    invoke-virtual {v1, v0}, La/eii0;->a(Lokhttp3/OkHttpClient$Builder;)V

    .line 25
    .line 26
    .line 27
    const-wide/16 v1, 0x3c

    .line 28
    .line 29
    invoke-virtual {v0, v1, v2}, Lokhttp3/OkHttpClient$Builder;->a(J)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0, v1, v2}, Lokhttp3/OkHttpClient$Builder;->b(J)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0, v1, v2}, Lokhttp3/OkHttpClient$Builder;->c(J)V

    .line 36
    .line 37
    .line 38
    new-instance v1, La/buc;

    .line 39
    .line 40
    const/4 v2, 0x1

    .line 41
    invoke-direct {v1, p0, v2}, La/buc;-><init>(Ljava/lang/Object;B)V

    .line 42
    .line 43
    .line 44
    iget-object v2, v0, Lokhttp3/OkHttpClient$Builder;->c:Ljava/util/ArrayList;

    .line 45
    .line 46
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    new-instance v1, Lokhttp3/logging/HttpLoggingInterceptor;

    .line 50
    .line 51
    invoke-direct {v1}, Lokhttp3/logging/HttpLoggingInterceptor;-><init>()V

    .line 52
    .line 53
    .line 54
    sget-object v2, Lokhttp3/logging/HttpLoggingInterceptor$Level;->a:Lokhttp3/logging/HttpLoggingInterceptor$Level;

    .line 55
    .line 56
    iput-object v2, v1, Lokhttp3/logging/HttpLoggingInterceptor;->d:Lokhttp3/logging/HttpLoggingInterceptor$Level;

    .line 57
    .line 58
    iget-object v2, v0, Lokhttp3/OkHttpClient$Builder;->c:Ljava/util/ArrayList;

    .line 59
    .line 60
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 61
    .line 62
    .line 63
    new-instance v1, La/ltf0;

    .line 64
    .line 65
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 66
    .line 67
    .line 68
    iget-object v2, v0, Lokhttp3/OkHttpClient$Builder;->c:Ljava/util/ArrayList;

    .line 69
    .line 70
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 71
    .line 72
    .line 73
    iget-object v1, p0, La/v8e;->d:La/ovq0;

    .line 74
    .line 75
    iget-object v2, v0, Lokhttp3/OkHttpClient$Builder;->c:Ljava/util/ArrayList;

    .line 76
    .line 77
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 78
    .line 79
    .line 80
    iget-object v1, p0, La/v8e;->c:La/sny;

    .line 81
    .line 82
    iget-object v2, v0, Lokhttp3/OkHttpClient$Builder;->c:Ljava/util/ArrayList;

    .line 83
    .line 84
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 85
    .line 86
    .line 87
    iget-object p0, p0, La/v8e;->e:La/eii0;

    .line 88
    .line 89
    iget-object p0, p0, La/eii0;->a:La/zn00;

    .line 90
    .line 91
    invoke-virtual {p0}, La/zn00;->H0()La/e6d0;

    .line 92
    .line 93
    .line 94
    move-result-object p0

    .line 95
    invoke-static {v0, p0}, La/eii0;->b(Lokhttp3/OkHttpClient$Builder;La/e6d0;)V

    .line 96
    .line 97
    .line 98
    new-instance p0, Lokhttp3/OkHttpClient;

    .line 99
    .line 100
    invoke-direct {p0, v0}, Lokhttp3/OkHttpClient;-><init>(Lokhttp3/OkHttpClient$Builder;)V

    .line 101
    .line 102
    .line 103
    return-object p0

    .line 104
    :pswitch_0
    iget-object v0, p0, La/v8e;->b:La/jwd;

    .line 105
    .line 106
    invoke-virtual {v0}, La/jwd;->invoke()Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object v0

    .line 110
    check-cast v0, Ljava/lang/String;

    .line 111
    .line 112
    iget-object v1, p0, La/v8e;->i:La/u8e;

    .line 113
    .line 114
    iget-object v2, p0, La/v8e;->h:Ljava/lang/String;

    .line 115
    .line 116
    invoke-virtual {v0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 117
    .line 118
    .line 119
    move-result v2

    .line 120
    if-eqz v2, :cond_0

    .line 121
    .line 122
    iget-object v2, p0, La/v8e;->i:La/u8e;

    .line 123
    .line 124
    if-eqz v2, :cond_0

    .line 125
    .line 126
    goto :goto_0

    .line 127
    :cond_0
    const/4 v1, 0x0

    .line 128
    :goto_0
    if-nez v1, :cond_1

    .line 129
    .line 130
    new-instance v1, La/x9g0;

    .line 131
    .line 132
    invoke-direct {v1}, La/x9g0;-><init>()V

    .line 133
    .line 134
    .line 135
    invoke-virtual {v1, v0}, La/x9g0;->b(Ljava/lang/String;)V

    .line 136
    .line 137
    .line 138
    iget-object v2, p0, La/v8e;->f:La/vby;

    .line 139
    .line 140
    sget-object v3, Lokhttp3/MediaType;->e:Lkotlin/text/Regex;

    .line 141
    .line 142
    const-string v3, "application/json"

    .line 143
    .line 144
    invoke-static {v3}, Lokhttp3/MediaType$Companion;->a(Ljava/lang/String;)Lokhttp3/MediaType;

    .line 145
    .line 146
    .line 147
    move-result-object v3

    .line 148
    invoke-static {v2, v3}, La/kcx;->E(La/vby;Lokhttp3/MediaType;)La/bvo;

    .line 149
    .line 150
    .line 151
    move-result-object v2

    .line 152
    invoke-virtual {v1, v2}, La/x9g0;->a(La/bvo;)V

    .line 153
    .line 154
    .line 155
    iget-object v2, p0, La/v8e;->g:La/n0o0;

    .line 156
    .line 157
    invoke-virtual {v2}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 158
    .line 159
    .line 160
    move-result-object v2

    .line 161
    check-cast v2, Lokhttp3/OkHttpClient;

    .line 162
    .line 163
    const-string v3, "client == null"

    .line 164
    .line 165
    invoke-static {v2, v3}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 166
    .line 167
    .line 168
    iput-object v2, v1, La/x9g0;->a:Lokhttp3/OkHttpClient;

    .line 169
    .line 170
    invoke-virtual {v1}, La/x9g0;->c()La/y9g0;

    .line 171
    .line 172
    .line 173
    move-result-object v1

    .line 174
    const-class v2, La/u8e;

    .line 175
    .line 176
    invoke-virtual {v1, v2}, La/y9g0;->b(Ljava/lang/Class;)Ljava/lang/Object;

    .line 177
    .line 178
    .line 179
    move-result-object v1

    .line 180
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 181
    .line 182
    .line 183
    check-cast v1, La/u8e;

    .line 184
    .line 185
    iput-object v0, p0, La/v8e;->h:Ljava/lang/String;

    .line 186
    .line 187
    iput-object v1, p0, La/v8e;->i:La/u8e;

    .line 188
    .line 189
    :cond_1
    return-object v1

    .line 190
    nop

    .line 191
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
