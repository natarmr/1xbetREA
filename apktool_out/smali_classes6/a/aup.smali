.class public final enum La/aup;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final synthetic b:[La/aup;

.field public static final synthetic c:La/c0o;


# instance fields
.field public final a:I


# direct methods
.method static constructor <clinit>()V
    .locals 8

    .line 1
    new-instance v0, La/aup;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const v2, 0x7f1316c5

    .line 5
    .line 6
    .line 7
    const-string v3, "TOTAL_STRIKES"

    .line 8
    .line 9
    invoke-direct {v0, v3, v1, v2}, La/aup;-><init>(Ljava/lang/String;II)V

    .line 10
    .line 11
    .line 12
    new-instance v1, La/aup;

    .line 13
    .line 14
    const/4 v2, 0x1

    .line 15
    const v3, 0x7f1316c2

    .line 16
    .line 17
    .line 18
    const-string v4, "SIGNIFICANT_STRIKES"

    .line 19
    .line 20
    invoke-direct {v1, v4, v2, v3}, La/aup;-><init>(Ljava/lang/String;II)V

    .line 21
    .line 22
    .line 23
    new-instance v2, La/aup;

    .line 24
    .line 25
    const/4 v3, 0x2

    .line 26
    const v4, 0x7f1316c0

    .line 27
    .line 28
    .line 29
    const-string v5, "KNOCKDOWNS"

    .line 30
    .line 31
    invoke-direct {v2, v5, v3, v4}, La/aup;-><init>(Ljava/lang/String;II)V

    .line 32
    .line 33
    .line 34
    new-instance v3, La/aup;

    .line 35
    .line 36
    const/4 v4, 0x3

    .line 37
    const v5, 0x7f1316c4

    .line 38
    .line 39
    .line 40
    const-string v6, "TAKEDOWNS"

    .line 41
    .line 42
    invoke-direct {v3, v6, v4, v5}, La/aup;-><init>(Ljava/lang/String;II)V

    .line 43
    .line 44
    .line 45
    new-instance v4, La/aup;

    .line 46
    .line 47
    const/4 v5, 0x4

    .line 48
    const v6, 0x7f1316c3

    .line 49
    .line 50
    .line 51
    const-string v7, "SUBMISSION_ATTEMPTS"

    .line 52
    .line 53
    invoke-direct {v4, v7, v5, v6}, La/aup;-><init>(Ljava/lang/String;II)V

    .line 54
    .line 55
    .line 56
    filled-new-array {v0, v1, v2, v3, v4}, [La/aup;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    sput-object v0, La/aup;->b:[La/aup;

    .line 61
    .line 62
    new-instance v1, La/c0o;

    .line 63
    .line 64
    invoke-direct {v1, v0}, La/c0o;-><init>([Ljava/lang/Enum;)V

    .line 65
    .line 66
    .line 67
    sput-object v1, La/aup;->c:La/c0o;

    .line 68
    .line 69
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;II)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    iput p3, p0, La/aup;->a:I

    .line 5
    .line 6
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)La/aup;
    .locals 1

    .line 1
    const-class v0, La/aup;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/aup;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[La/aup;
    .locals 1

    .line 1
    sget-object v0, La/aup;->b:[La/aup;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [La/aup;

    .line 8
    .line 9
    return-object v0
.end method
