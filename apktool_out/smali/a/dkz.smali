.class public final La/dkz;
.super La/lwb0;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# static fields
.field public static final g:La/dkz;

.field public static final h:La/dkz;

.field public static final i:La/dkz;

.field public static final j:La/dkz;

.field public static final k:La/dkz;

.field public static final l:La/dkz;

.field public static final m:La/dkz;

.field public static final n:La/dkz;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, La/dkz;

    .line 2
    .line 3
    const v1, 0x7fffffff

    .line 4
    .line 5
    .line 6
    const-string v2, "OFF"

    .line 7
    .line 8
    invoke-direct {v0, v1, v2}, La/lwb0;-><init>(ILjava/lang/String;)V

    .line 9
    .line 10
    .line 11
    sput-object v0, La/dkz;->g:La/dkz;

    .line 12
    .line 13
    new-instance v0, La/dkz;

    .line 14
    .line 15
    const v1, 0xc350

    .line 16
    .line 17
    .line 18
    const-string v2, "FATAL"

    .line 19
    .line 20
    invoke-direct {v0, v1, v2}, La/lwb0;-><init>(ILjava/lang/String;)V

    .line 21
    .line 22
    .line 23
    sput-object v0, La/dkz;->h:La/dkz;

    .line 24
    .line 25
    new-instance v0, La/dkz;

    .line 26
    .line 27
    const v1, 0x9c40

    .line 28
    .line 29
    .line 30
    const-string v2, "ERROR"

    .line 31
    .line 32
    invoke-direct {v0, v1, v2}, La/lwb0;-><init>(ILjava/lang/String;)V

    .line 33
    .line 34
    .line 35
    sput-object v0, La/dkz;->i:La/dkz;

    .line 36
    .line 37
    new-instance v0, La/dkz;

    .line 38
    .line 39
    const/16 v1, 0x7530

    .line 40
    .line 41
    const-string v2, "WARN"

    .line 42
    .line 43
    invoke-direct {v0, v1, v2}, La/lwb0;-><init>(ILjava/lang/String;)V

    .line 44
    .line 45
    .line 46
    sput-object v0, La/dkz;->j:La/dkz;

    .line 47
    .line 48
    new-instance v0, La/dkz;

    .line 49
    .line 50
    const/16 v1, 0x4e20

    .line 51
    .line 52
    const-string v2, "INFO"

    .line 53
    .line 54
    invoke-direct {v0, v1, v2}, La/lwb0;-><init>(ILjava/lang/String;)V

    .line 55
    .line 56
    .line 57
    sput-object v0, La/dkz;->k:La/dkz;

    .line 58
    .line 59
    new-instance v0, La/dkz;

    .line 60
    .line 61
    const/16 v1, 0x2710

    .line 62
    .line 63
    const-string v2, "DEBUG"

    .line 64
    .line 65
    invoke-direct {v0, v1, v2}, La/lwb0;-><init>(ILjava/lang/String;)V

    .line 66
    .line 67
    .line 68
    sput-object v0, La/dkz;->l:La/dkz;

    .line 69
    .line 70
    new-instance v0, La/dkz;

    .line 71
    .line 72
    const/16 v1, 0x1388

    .line 73
    .line 74
    const-string v2, "TRACE"

    .line 75
    .line 76
    invoke-direct {v0, v1, v2}, La/lwb0;-><init>(ILjava/lang/String;)V

    .line 77
    .line 78
    .line 79
    sput-object v0, La/dkz;->m:La/dkz;

    .line 80
    .line 81
    new-instance v0, La/dkz;

    .line 82
    .line 83
    const/high16 v1, -0x80000000

    .line 84
    .line 85
    const-string v2, "ALL"

    .line 86
    .line 87
    invoke-direct {v0, v1, v2}, La/lwb0;-><init>(ILjava/lang/String;)V

    .line 88
    .line 89
    .line 90
    sput-object v0, La/dkz;->n:La/dkz;

    .line 91
    .line 92
    return-void
.end method
