.class public final La/omw0;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# instance fields
.field public final a:Ljava/lang/ref/WeakReference;

.field public final b:Lcom/google/android/gms/tasks/TaskCompletionSource;

.field public final c:Lcom/google/firebase/auth/FirebaseAuth;

.field public final synthetic d:La/s88;


# direct methods
.method public constructor <init>(La/s88;La/kxq;Lcom/google/android/gms/tasks/TaskCompletionSource;Lcom/google/firebase/auth/FirebaseAuth;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/omw0;->d:La/s88;

    .line 2
    .line 3
    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance p1, Ljava/lang/ref/WeakReference;

    .line 7
    .line 8
    invoke-direct {p1, p2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    iput-object p1, p0, La/omw0;->a:Ljava/lang/ref/WeakReference;

    .line 12
    .line 13
    iput-object p3, p0, La/omw0;->b:Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 14
    .line 15
    iput-object p4, p0, La/omw0;->c:Lcom/google/firebase/auth/FirebaseAuth;

    .line 16
    .line 17
    return-void
.end method


# virtual methods
.method public final onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 4

    .line 1
    iget-object v0, p0, La/omw0;->a:Ljava/lang/ref/WeakReference;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Landroid/app/Activity;

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    iget-object v2, p0, La/omw0;->b:Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 11
    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    const-string p0, "FederatedAuthReceiver"

    .line 15
    .line 16
    const-string p2, "Failed to unregister BroadcastReceiver because the Activity that launched this flow has been garbage collected; please do not finish() your Activity while performing a FederatedAuthProvider operation."

    .line 17
    .line 18
    invoke-static {p0, p2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 19
    .line 20
    .line 21
    new-instance p0, Lcom/google/android/gms/common/api/Status;

    .line 22
    .line 23
    const/16 p2, 0x445b

    .line 24
    .line 25
    const-string v0, "Activity that started the web operation is no longer alive; see logcat for details"

    .line 26
    .line 27
    invoke-direct {p0, p2, v0, v1, v1}, Lcom/google/android/gms/common/api/Status;-><init>(ILjava/lang/String;Landroid/app/PendingIntent;Lcom/google/android/gms/common/ConnectionResult;)V

    .line 28
    .line 29
    .line 30
    invoke-static {p0}, La/jfw0;->a(Lcom/google/android/gms/common/api/Status;)La/c44;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    invoke-virtual {v2, p0}, Lcom/google/android/gms/tasks/TaskCompletionSource;->setException(Ljava/lang/Exception;)V

    .line 35
    .line 36
    .line 37
    invoke-static {p1}, La/s88;->y(Landroid/content/Context;)V

    .line 38
    .line 39
    .line 40
    return-void

    .line 41
    :cond_0
    const-string v0, "com.google.firebase.auth.internal.OPERATION"

    .line 42
    .line 43
    invoke-virtual {p2, v0}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z

    .line 44
    .line 45
    .line 46
    move-result v3

    .line 47
    if-eqz v3, :cond_4

    .line 48
    .line 49
    invoke-virtual {p2, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    const-string v3, "com.google.firebase.auth.internal.NONGMSCORE_SIGN_IN"

    .line 54
    .line 55
    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    move-result v3

    .line 59
    if-eqz v3, :cond_1

    .line 60
    .line 61
    iget-object v0, p0, La/omw0;->c:Lcom/google/firebase/auth/FirebaseAuth;

    .line 62
    .line 63
    invoke-static {p2}, La/s88;->x(Landroid/content/Intent;)Lcom/google/firebase/auth/zzc;

    .line 64
    .line 65
    .line 66
    move-result-object p2

    .line 67
    invoke-virtual {v0, p2}, Lcom/google/firebase/auth/FirebaseAuth;->b(Lcom/google/firebase/auth/zzc;)Lcom/google/android/gms/tasks/Task;

    .line 68
    .line 69
    .line 70
    move-result-object p2

    .line 71
    new-instance v0, La/afm0;

    .line 72
    .line 73
    iget-object p0, p0, La/omw0;->d:La/s88;

    .line 74
    .line 75
    invoke-direct {v0, p0, v2, p1}, La/afm0;-><init>(La/s88;Lcom/google/android/gms/tasks/TaskCompletionSource;Landroid/content/Context;)V

    .line 76
    .line 77
    .line 78
    invoke-virtual {p2, v0}, Lcom/google/android/gms/tasks/Task;->addOnSuccessListener(Lcom/google/android/gms/tasks/OnSuccessListener;)Lcom/google/android/gms/tasks/Task;

    .line 79
    .line 80
    .line 81
    move-result-object p2

    .line 82
    new-instance v0, La/fck0;

    .line 83
    .line 84
    invoke-direct {v0, p0, v2, p1}, La/fck0;-><init>(La/s88;Lcom/google/android/gms/tasks/TaskCompletionSource;Landroid/content/Context;)V

    .line 85
    .line 86
    .line 87
    invoke-virtual {p2, v0}, Lcom/google/android/gms/tasks/Task;->addOnFailureListener(Lcom/google/android/gms/tasks/OnFailureListener;)Lcom/google/android/gms/tasks/Task;

    .line 88
    .line 89
    .line 90
    return-void

    .line 91
    :cond_1
    const-string p0, "com.google.firebase.auth.internal.NONGMSCORE_LINK"

    .line 92
    .line 93
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 94
    .line 95
    .line 96
    move-result p0

    .line 97
    if-nez p0, :cond_3

    .line 98
    .line 99
    const-string p0, "com.google.firebase.auth.internal.NONGMSCORE_REAUTHENTICATE"

    .line 100
    .line 101
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 102
    .line 103
    .line 104
    move-result p0

    .line 105
    if-nez p0, :cond_2

    .line 106
    .line 107
    new-instance p0, Ljava/lang/StringBuilder;

    .line 108
    .line 109
    const-string p1, "WEB_CONTEXT_CANCELED:Unknown operation received ("

    .line 110
    .line 111
    invoke-direct {p0, p1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 112
    .line 113
    .line 114
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 115
    .line 116
    .line 117
    const-string p1, ")"

    .line 118
    .line 119
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 120
    .line 121
    .line 122
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 123
    .line 124
    .line 125
    move-result-object p0

    .line 126
    invoke-static {p0}, La/msm0;->v(Ljava/lang/String;)Lcom/google/android/gms/common/api/Status;

    .line 127
    .line 128
    .line 129
    move-result-object p0

    .line 130
    invoke-static {p0}, La/jfw0;->a(Lcom/google/android/gms/common/api/Status;)La/c44;

    .line 131
    .line 132
    .line 133
    move-result-object p0

    .line 134
    invoke-virtual {v2, p0}, Lcom/google/android/gms/tasks/TaskCompletionSource;->setException(Ljava/lang/Exception;)V

    .line 135
    .line 136
    .line 137
    return-void

    .line 138
    :cond_2
    invoke-static {p2}, La/s88;->x(Landroid/content/Intent;)Lcom/google/firebase/auth/zzc;

    .line 139
    .line 140
    .line 141
    throw v1

    .line 142
    :cond_3
    invoke-static {p2}, La/s88;->x(Landroid/content/Intent;)Lcom/google/firebase/auth/zzc;

    .line 143
    .line 144
    .line 145
    throw v1

    .line 146
    :cond_4
    sget-object p0, La/now0;->a:Ljava/util/HashMap;

    .line 147
    .line 148
    const-string p0, "com.google.firebase.auth.internal.STATUS"

    .line 149
    .line 150
    invoke-virtual {p2, p0}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z

    .line 151
    .line 152
    .line 153
    move-result v0

    .line 154
    if-eqz v0, :cond_6

    .line 155
    .line 156
    invoke-virtual {p2, p0}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z

    .line 157
    .line 158
    .line 159
    move-result v0

    .line 160
    invoke-static {v0}, La/s0x;->C(Z)V

    .line 161
    .line 162
    .line 163
    sget-object v0, Lcom/google/android/gms/common/api/Status;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 164
    .line 165
    invoke-virtual {p2, p0}, Landroid/content/Intent;->getByteArrayExtra(Ljava/lang/String;)[B

    .line 166
    .line 167
    .line 168
    move-result-object p0

    .line 169
    if-nez p0, :cond_5

    .line 170
    .line 171
    goto :goto_0

    .line 172
    :cond_5
    invoke-static {p0, v0}, La/n6x;->w([BLandroid/os/Parcelable$Creator;)Lcom/google/android/gms/common/internal/safeparcel/SafeParcelable;

    .line 173
    .line 174
    .line 175
    move-result-object v1

    .line 176
    :goto_0
    check-cast v1, Lcom/google/android/gms/common/api/Status;

    .line 177
    .line 178
    invoke-static {v1}, La/jfw0;->a(Lcom/google/android/gms/common/api/Status;)La/c44;

    .line 179
    .line 180
    .line 181
    move-result-object p0

    .line 182
    invoke-virtual {v2, p0}, Lcom/google/android/gms/tasks/TaskCompletionSource;->setException(Ljava/lang/Exception;)V

    .line 183
    .line 184
    .line 185
    invoke-static {p1}, La/s88;->y(Landroid/content/Context;)V

    .line 186
    .line 187
    .line 188
    return-void

    .line 189
    :cond_6
    const-string p0, "com.google.firebase.auth.internal.EXTRA_CANCELED"

    .line 190
    .line 191
    invoke-virtual {p2, p0}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z

    .line 192
    .line 193
    .line 194
    move-result p0

    .line 195
    if-eqz p0, :cond_7

    .line 196
    .line 197
    const-string p0, "WEB_CONTEXT_CANCELED"

    .line 198
    .line 199
    invoke-static {p0}, La/msm0;->v(Ljava/lang/String;)Lcom/google/android/gms/common/api/Status;

    .line 200
    .line 201
    .line 202
    move-result-object p0

    .line 203
    invoke-static {p0}, La/jfw0;->a(Lcom/google/android/gms/common/api/Status;)La/c44;

    .line 204
    .line 205
    .line 206
    move-result-object p0

    .line 207
    invoke-virtual {v2, p0}, Lcom/google/android/gms/tasks/TaskCompletionSource;->setException(Ljava/lang/Exception;)V

    .line 208
    .line 209
    .line 210
    invoke-static {p1}, La/s88;->y(Landroid/content/Context;)V

    .line 211
    .line 212
    .line 213
    :cond_7
    return-void
.end method
