.class public abstract La/p2i0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:La/pfw;

.field public static final b:La/pfw;

.field public static final c:La/pfw;

.field public static final d:La/pfw;

.field public static final e:La/pfw;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, La/pfw;

    .line 2
    .line 3
    const-string v1, "STATE_REG"

    .line 4
    .line 5
    const/4 v2, 0x6

    .line 6
    invoke-direct {v0, v1, v2}, La/pfw;-><init>(Ljava/lang/String;B)V

    .line 7
    .line 8
    .line 9
    sput-object v0, La/p2i0;->a:La/pfw;

    .line 10
    .line 11
    new-instance v0, La/pfw;

    .line 12
    .line 13
    const-string v1, "STATE_COMPLETED"

    .line 14
    .line 15
    invoke-direct {v0, v1, v2}, La/pfw;-><init>(Ljava/lang/String;B)V

    .line 16
    .line 17
    .line 18
    sput-object v0, La/p2i0;->b:La/pfw;

    .line 19
    .line 20
    new-instance v0, La/pfw;

    .line 21
    .line 22
    const-string v1, "STATE_CANCELLED"

    .line 23
    .line 24
    invoke-direct {v0, v1, v2}, La/pfw;-><init>(Ljava/lang/String;B)V

    .line 25
    .line 26
    .line 27
    sput-object v0, La/p2i0;->c:La/pfw;

    .line 28
    .line 29
    new-instance v0, La/pfw;

    .line 30
    .line 31
    const-string v1, "NO_RESULT"

    .line 32
    .line 33
    invoke-direct {v0, v1, v2}, La/pfw;-><init>(Ljava/lang/String;B)V

    .line 34
    .line 35
    .line 36
    sput-object v0, La/p2i0;->d:La/pfw;

    .line 37
    .line 38
    new-instance v0, La/pfw;

    .line 39
    .line 40
    const-string v1, "PARAM_CLAUSE_0"

    .line 41
    .line 42
    invoke-direct {v0, v1, v2}, La/pfw;-><init>(Ljava/lang/String;B)V

    .line 43
    .line 44
    .line 45
    sput-object v0, La/p2i0;->e:La/pfw;

    .line 46
    .line 47
    return-void
.end method
