.class public final enum La/bv1;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final c:La/qek0;

.field public static final enum d:La/bv1;

.field public static final enum e:La/bv1;

.field public static final synthetic f:[La/bv1;

.field public static final synthetic g:La/c0o;


# instance fields
.field public final a:B

.field public final b:La/s9s0;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 1
    new-instance v0, La/bv1;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    sget-object v2, La/s9s0;->a:La/s9s0;

    .line 5
    .line 6
    const-string v3, "DESCRIPTION"

    .line 7
    .line 8
    invoke-direct {v0, v3, v1, v1, v2}, La/bv1;-><init>(Ljava/lang/String;IILa/s9s0;)V

    .line 9
    .line 10
    .line 11
    sput-object v0, La/bv1;->d:La/bv1;

    .line 12
    .line 13
    new-instance v1, La/bv1;

    .line 14
    .line 15
    const/4 v2, 0x1

    .line 16
    sget-object v3, La/s9s0;->b:La/s9s0;

    .line 17
    .line 18
    const-string v4, "GAMES"

    .line 19
    .line 20
    invoke-direct {v1, v4, v2, v2, v3}, La/bv1;-><init>(Ljava/lang/String;IILa/s9s0;)V

    .line 21
    .line 22
    .line 23
    sput-object v1, La/bv1;->e:La/bv1;

    .line 24
    .line 25
    new-instance v2, La/bv1;

    .line 26
    .line 27
    const/4 v3, 0x2

    .line 28
    sget-object v4, La/s9s0;->c:La/s9s0;

    .line 29
    .line 30
    const-string v5, "RESULTS"

    .line 31
    .line 32
    invoke-direct {v2, v5, v3, v3, v4}, La/bv1;-><init>(Ljava/lang/String;IILa/s9s0;)V

    .line 33
    .line 34
    .line 35
    new-instance v3, La/bv1;

    .line 36
    .line 37
    const/4 v4, 0x3

    .line 38
    sget-object v5, La/s9s0;->d:La/s9s0;

    .line 39
    .line 40
    const-string v6, "CONDITIONS"

    .line 41
    .line 42
    invoke-direct {v3, v6, v4, v4, v5}, La/bv1;-><init>(Ljava/lang/String;IILa/s9s0;)V

    .line 43
    .line 44
    .line 45
    filled-new-array {v0, v1, v2, v3}, [La/bv1;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    sput-object v0, La/bv1;->f:[La/bv1;

    .line 50
    .line 51
    new-instance v1, La/c0o;

    .line 52
    .line 53
    invoke-direct {v1, v0}, La/c0o;-><init>([Ljava/lang/Enum;)V

    .line 54
    .line 55
    .line 56
    sput-object v1, La/bv1;->g:La/c0o;

    .line 57
    .line 58
    new-instance v0, La/qek0;

    .line 59
    .line 60
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 61
    .line 62
    .line 63
    sput-object v0, La/bv1;->c:La/qek0;

    .line 64
    .line 65
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;IILa/s9s0;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    iput-byte p3, p0, La/bv1;->a:B

    .line 5
    .line 6
    iput-object p4, p0, La/bv1;->b:La/s9s0;

    .line 7
    .line 8
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)La/bv1;
    .locals 1

    .line 1
    const-class v0, La/bv1;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/bv1;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[La/bv1;
    .locals 1

    .line 1
    sget-object v0, La/bv1;->f:[La/bv1;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [La/bv1;

    .line 8
    .line 9
    return-object v0
.end method
