.class public final enum La/yrs;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final synthetic b:[La/yrs;

.field public static final synthetic c:La/c0o;


# instance fields
.field public final a:La/t9m0;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, La/yrs;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    sget-object v2, La/t9m0;->c2:La/t9m0;

    .line 5
    .line 6
    const-string v3, "STATISTIC"

    .line 7
    .line 8
    invoke-direct {v0, v3, v1, v2}, La/yrs;-><init>(Ljava/lang/String;ILa/t9m0;)V

    .line 9
    .line 10
    .line 11
    new-instance v1, La/yrs;

    .line 12
    .line 13
    const/4 v2, 0x1

    .line 14
    sget-object v3, La/t9m0;->d2:La/t9m0;

    .line 15
    .line 16
    const-string v4, "LAST_FIGHTS"

    .line 17
    .line 18
    invoke-direct {v1, v4, v2, v3}, La/yrs;-><init>(Ljava/lang/String;ILa/t9m0;)V

    .line 19
    .line 20
    .line 21
    filled-new-array {v0, v1}, [La/yrs;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    sput-object v0, La/yrs;->b:[La/yrs;

    .line 26
    .line 27
    new-instance v1, La/c0o;

    .line 28
    .line 29
    invoke-direct {v1, v0}, La/c0o;-><init>([Ljava/lang/Enum;)V

    .line 30
    .line 31
    .line 32
    sput-object v1, La/yrs;->c:La/c0o;

    .line 33
    .line 34
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILa/t9m0;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    iput-object p3, p0, La/yrs;->a:La/t9m0;

    .line 5
    .line 6
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)La/yrs;
    .locals 1

    .line 1
    const-class v0, La/yrs;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/yrs;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[La/yrs;
    .locals 1

    .line 1
    sget-object v0, La/yrs;->b:[La/yrs;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [La/yrs;

    .line 8
    .line 9
    return-object v0
.end method
