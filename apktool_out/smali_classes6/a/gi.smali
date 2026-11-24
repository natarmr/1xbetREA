.class public final enum La/gi;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation runtime La/ahi0;
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "La/gi;",
        ">;"
    }
.end annotation


# static fields
.field public static final Companion:La/fi;

.field public static final a:La/a8z;

.field public static final enum b:La/gi;

.field public static final enum c:La/gi;

.field public static final enum d:La/gi;

.field public static final enum e:La/gi;

.field public static final synthetic f:[La/gi;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, La/gi;

    .line 2
    .line 3
    const-string v1, "FIRST"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 7
    .line 8
    .line 9
    sput-object v0, La/gi;->b:La/gi;

    .line 10
    .line 11
    new-instance v1, La/gi;

    .line 12
    .line 13
    const-string v2, "SECOND"

    .line 14
    .line 15
    const/4 v3, 0x1

    .line 16
    invoke-direct {v1, v2, v3}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 17
    .line 18
    .line 19
    sput-object v1, La/gi;->c:La/gi;

    .line 20
    .line 21
    new-instance v2, La/gi;

    .line 22
    .line 23
    const-string v3, "THIRD"

    .line 24
    .line 25
    const/4 v4, 0x2

    .line 26
    invoke-direct {v2, v3, v4}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 27
    .line 28
    .line 29
    sput-object v2, La/gi;->d:La/gi;

    .line 30
    .line 31
    new-instance v3, La/gi;

    .line 32
    .line 33
    const-string v4, "CHECK_BOX"

    .line 34
    .line 35
    const/4 v5, 0x3

    .line 36
    invoke-direct {v3, v4, v5}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 37
    .line 38
    .line 39
    sput-object v3, La/gi;->e:La/gi;

    .line 40
    .line 41
    filled-new-array {v0, v1, v2, v3}, [La/gi;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    sput-object v0, La/gi;->f:[La/gi;

    .line 46
    .line 47
    new-instance v0, La/c0o;

    .line 48
    .line 49
    new-instance v0, La/fi;

    .line 50
    .line 51
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 52
    .line 53
    .line 54
    sput-object v0, La/gi;->Companion:La/fi;

    .line 55
    .line 56
    sget-object v0, La/wez;->a:La/wez;

    .line 57
    .line 58
    new-instance v1, La/q8;

    .line 59
    .line 60
    const/4 v2, 0x7

    .line 61
    invoke-direct {v1, v2}, La/q8;-><init>(B)V

    .line 62
    .line 63
    .line 64
    invoke-static {v0, v1}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    sput-object v0, La/gi;->a:La/a8z;

    .line 69
    .line 70
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)La/gi;
    .locals 1

    .line 1
    const-class v0, La/gi;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/gi;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[La/gi;
    .locals 1

    .line 1
    sget-object v0, La/gi;->f:[La/gi;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [La/gi;

    .line 8
    .line 9
    return-object v0
.end method
