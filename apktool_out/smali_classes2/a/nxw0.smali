.class public final La/nxw0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(La/glt0;La/y7x0;)V
    .locals 1

    const/4 v0, 0x3

    iput-byte v0, p0, La/nxw0;->a:B

    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/nxw0;->c:Ljava/lang/Object;

    iput-object p2, p0, La/nxw0;->b:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(La/m6x0;Lcom/google/android/gms/measurement/internal/zzr;)V
    .locals 1

    .line 1
    const/4 v0, 0x2

    .line 2
    iput-byte v0, p0, La/nxw0;->a:B

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p2, p0, La/nxw0;->c:Ljava/lang/Object;

    .line 8
    .line 9
    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    iput-object p1, p0, La/nxw0;->b:Ljava/lang/Object;

    .line 13
    .line 14
    return-void
.end method

.method public synthetic constructor <init>(La/oyw0;Ljava/lang/Object;B)V
    .locals 0

    .line 15
    iput-byte p3, p0, La/nxw0;->a:B

    iput-object p2, p0, La/nxw0;->c:Ljava/lang/Object;

    iput-object p1, p0, La/nxw0;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 7

    .line 1
    iget-byte v0, p0, La/nxw0;->a:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object v2, p0, La/nxw0;->b:Ljava/lang/Object;

    .line 5
    .line 6
    iget-object p0, p0, La/nxw0;->c:Ljava/lang/Object;

    .line 7
    .line 8
    packed-switch v0, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    check-cast p0, La/glt0;

    .line 12
    .line 13
    check-cast v2, La/y7x0;

    .line 14
    .line 15
    iget-object v0, p0, La/glt0;->b:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v0, La/c1x0;

    .line 18
    .line 19
    new-instance v3, La/hcp0;

    .line 20
    .line 21
    const/16 v4, 0x17

    .line 22
    .line 23
    invoke-direct {v3, v4}, La/hcp0;-><init>(B)V

    .line 24
    .line 25
    .line 26
    :try_start_0
    iget-object v4, v0, La/c1x0;->f:La/lin0;

    .line 27
    .line 28
    invoke-interface {v4}, La/lin0;->get()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v4

    .line 32
    check-cast v4, La/x8x0;

    .line 33
    .line 34
    iget-object v5, p0, La/glt0;->c:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast v5, Landroid/net/Uri;

    .line 37
    .line 38
    new-instance v6, La/trm0;

    .line 39
    .line 40
    invoke-direct {v6, v2}, La/trm0;-><init>(La/jdw0;)V

    .line 41
    .line 42
    .line 43
    filled-new-array {v3}, [La/hcp0;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    iput-object v2, v6, La/trm0;->c:Ljava/lang/Object;

    .line 48
    .line 49
    invoke-virtual {v4, v5, v6}, La/x8x0;->a(Landroid/net/Uri;La/v8x0;)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v2

    .line 53
    check-cast v2, Ljava/lang/Void;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 54
    .line 55
    goto :goto_1

    .line 56
    :catch_0
    move-exception v2

    .line 57
    goto :goto_0

    .line 58
    :catch_1
    move-exception v2

    .line 59
    :goto_0
    sget-object v3, Ljava/util/logging/Level;->WARNING:Ljava/util/logging/Level;

    .line 60
    .line 61
    invoke-virtual {v0}, La/c1x0;->a()La/fr40;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    iget-object p0, p0, La/glt0;->d:Ljava/lang/Object;

    .line 66
    .line 67
    check-cast p0, Ljava/lang/String;

    .line 68
    .line 69
    filled-new-array {p0}, [Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    const-string v4, "Failed to update snapshot for %s flags may be stale."

    .line 74
    .line 75
    invoke-static {v3, v0, v2, v4, p0}, La/k7n0;->I(Ljava/util/logging/Level;Ljava/util/concurrent/Executor;Ljava/lang/Exception;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 76
    .line 77
    .line 78
    :goto_1
    return-object v1

    .line 79
    :pswitch_0
    check-cast p0, Lcom/google/android/gms/measurement/internal/zzr;

    .line 80
    .line 81
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzr;->a:Ljava/lang/String;

    .line 82
    .line 83
    invoke-static {v0}, La/s0x;->H(Ljava/lang/Object;)V

    .line 84
    .line 85
    .line 86
    check-cast v2, La/m6x0;

    .line 87
    .line 88
    invoke-virtual {v2, v0}, La/m6x0;->a(Ljava/lang/String;)La/xyw0;

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    sget-object v3, La/wyw0;->c:La/wyw0;

    .line 93
    .line 94
    invoke-virtual {v0, v3}, La/xyw0;->i(La/wyw0;)Z

    .line 95
    .line 96
    .line 97
    move-result v0

    .line 98
    if-eqz v0, :cond_1

    .line 99
    .line 100
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzr;->s:Ljava/lang/String;

    .line 101
    .line 102
    const/16 v4, 0x64

    .line 103
    .line 104
    invoke-static {v4, v0}, La/xyw0;->c(ILjava/lang/String;)La/xyw0;

    .line 105
    .line 106
    .line 107
    move-result-object v0

    .line 108
    invoke-virtual {v0, v3}, La/xyw0;->i(La/wyw0;)Z

    .line 109
    .line 110
    .line 111
    move-result v0

    .line 112
    if-nez v0, :cond_0

    .line 113
    .line 114
    goto :goto_2

    .line 115
    :cond_0
    invoke-virtual {v2, p0}, La/m6x0;->c0(Lcom/google/android/gms/measurement/internal/zzr;)La/hvw0;

    .line 116
    .line 117
    .line 118
    move-result-object p0

    .line 119
    invoke-virtual {p0}, La/hvw0;->F()Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    move-result-object v1

    .line 123
    goto :goto_3

    .line 124
    :cond_1
    :goto_2
    invoke-virtual {v2}, La/m6x0;->r()La/uuw0;

    .line 125
    .line 126
    .line 127
    move-result-object p0

    .line 128
    iget-object p0, p0, La/uuw0;->o:La/quw0;

    .line 129
    .line 130
    const-string v0, "Analytics storage consent denied. Returning null app instance id"

    .line 131
    .line 132
    invoke-virtual {p0, v0}, La/quw0;->a(Ljava/lang/String;)V

    .line 133
    .line 134
    .line 135
    :goto_3
    return-object v1

    .line 136
    :pswitch_1
    check-cast v2, La/oyw0;

    .line 137
    .line 138
    iget-object v0, v2, La/oyw0;->a:La/m6x0;

    .line 139
    .line 140
    invoke-virtual {v0}, La/m6x0;->V()V

    .line 141
    .line 142
    .line 143
    check-cast p0, Lcom/google/android/gms/measurement/internal/zzr;

    .line 144
    .line 145
    new-instance v1, Lcom/google/android/gms/measurement/internal/zzao;

    .line 146
    .line 147
    iget-object p0, p0, Lcom/google/android/gms/measurement/internal/zzr;->a:Ljava/lang/String;

    .line 148
    .line 149
    invoke-virtual {v0, p0}, La/m6x0;->p0(Ljava/lang/String;)Landroid/os/Bundle;

    .line 150
    .line 151
    .line 152
    move-result-object p0

    .line 153
    invoke-direct {v1, p0}, Lcom/google/android/gms/measurement/internal/zzao;-><init>(Landroid/os/Bundle;)V

    .line 154
    .line 155
    .line 156
    return-object v1

    .line 157
    :pswitch_2
    check-cast v2, La/oyw0;

    .line 158
    .line 159
    iget-object v0, v2, La/oyw0;->a:La/m6x0;

    .line 160
    .line 161
    invoke-virtual {v0}, La/m6x0;->V()V

    .line 162
    .line 163
    .line 164
    iget-object v0, v0, La/m6x0;->c:La/zlw0;

    .line 165
    .line 166
    invoke-static {v0}, La/m6x0;->T(La/u5x0;)V

    .line 167
    .line 168
    .line 169
    check-cast p0, Ljava/lang/String;

    .line 170
    .line 171
    invoke-virtual {v0, p0}, La/zlw0;->i2(Ljava/lang/String;)Ljava/util/List;

    .line 172
    .line 173
    .line 174
    move-result-object p0

    .line 175
    return-object p0

    .line 176
    nop

    .line 177
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
