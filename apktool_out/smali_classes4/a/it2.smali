.class public final enum La/it2;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum b:La/it2;

.field public static final enum c:La/it2;

.field public static final enum d:La/it2;

.field public static final enum e:La/it2;

.field public static final enum f:La/it2;

.field public static final enum g:La/it2;

.field public static final enum h:La/it2;

.field public static final synthetic i:[La/it2;


# instance fields
.field public final a:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 11

    .line 1
    new-instance v0, La/it2;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const-string v2, "linking_phone"

    .line 5
    .line 6
    const-string v3, "LINKING_PHONE"

    .line 7
    .line 8
    invoke-direct {v0, v3, v1, v2}, La/it2;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 9
    .line 10
    .line 11
    sput-object v0, La/it2;->b:La/it2;

    .line 12
    .line 13
    new-instance v1, La/it2;

    .line 14
    .line 15
    const/4 v2, 0x1

    .line 16
    const-string v3, "phone_activate"

    .line 17
    .line 18
    const-string v4, "PHONE_ACTIVATE"

    .line 19
    .line 20
    invoke-direct {v1, v4, v2, v3}, La/it2;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 21
    .line 22
    .line 23
    sput-object v1, La/it2;->c:La/it2;

    .line 24
    .line 25
    new-instance v2, La/it2;

    .line 26
    .line 27
    const/4 v3, 0x2

    .line 28
    const-string v4, "pass_recovery"

    .line 29
    .line 30
    const-string v5, "PASS_RECOVERY"

    .line 31
    .line 32
    invoke-direct {v2, v5, v3, v4}, La/it2;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 33
    .line 34
    .line 35
    sput-object v2, La/it2;->d:La/it2;

    .line 36
    .line 37
    new-instance v3, La/it2;

    .line 38
    .line 39
    const/4 v4, 0x3

    .line 40
    const-string v5, "change"

    .line 41
    .line 42
    const-string v6, "CHANGE"

    .line 43
    .line 44
    invoke-direct {v3, v6, v4, v5}, La/it2;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 45
    .line 46
    .line 47
    sput-object v3, La/it2;->e:La/it2;

    .line 48
    .line 49
    new-instance v4, La/it2;

    .line 50
    .line 51
    const/4 v5, 0x4

    .line 52
    const-string v6, "authenticator_connect"

    .line 53
    .line 54
    const-string v7, "AUTHENTICATOR_CONNECT"

    .line 55
    .line 56
    invoke-direct {v4, v7, v5, v6}, La/it2;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 57
    .line 58
    .line 59
    new-instance v5, La/it2;

    .line 60
    .line 61
    const/4 v6, 0x5

    .line 62
    const-string v7, "linking_authenticator"

    .line 63
    .line 64
    const-string v8, "LINKING_AUTHENTICATOR"

    .line 65
    .line 66
    invoke-direct {v5, v8, v6, v7}, La/it2;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 67
    .line 68
    .line 69
    sput-object v5, La/it2;->f:La/it2;

    .line 70
    .line 71
    new-instance v6, La/it2;

    .line 72
    .line 73
    const/4 v7, 0x6

    .line 74
    const-string v8, "registration_by_phone"

    .line 75
    .line 76
    const-string v9, "REGISTRATION_BY_PHONE"

    .line 77
    .line 78
    invoke-direct {v6, v9, v7, v8}, La/it2;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 79
    .line 80
    .line 81
    sput-object v6, La/it2;->g:La/it2;

    .line 82
    .line 83
    new-instance v7, La/it2;

    .line 84
    .line 85
    const/4 v8, 0x7

    .line 86
    const-string v9, "support"

    .line 87
    .line 88
    const-string v10, "SUPPORT"

    .line 89
    .line 90
    invoke-direct {v7, v10, v8, v9}, La/it2;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 91
    .line 92
    .line 93
    sput-object v7, La/it2;->h:La/it2;

    .line 94
    .line 95
    filled-new-array/range {v0 .. v7}, [La/it2;

    .line 96
    .line 97
    .line 98
    move-result-object v0

    .line 99
    sput-object v0, La/it2;->i:[La/it2;

    .line 100
    .line 101
    new-instance v0, La/c0o;

    .line 102
    .line 103
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    iput-object p3, p0, La/it2;->a:Ljava/lang/String;

    .line 5
    .line 6
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)La/it2;
    .locals 1

    .line 1
    const-class v0, La/it2;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/it2;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[La/it2;
    .locals 1

    .line 1
    sget-object v0, La/it2;->i:[La/it2;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [La/it2;

    .line 8
    .line 9
    return-object v0
.end method
