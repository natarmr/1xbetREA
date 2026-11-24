.class public final enum La/na90;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation runtime La/ahi0;
    with = La/oa90;
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "La/na90;",
        ">;"
    }
.end annotation


# static fields
.field public static final Companion:La/ma90;

.field public static final enum b:La/na90;

.field public static final enum c:La/na90;

.field public static final synthetic d:[La/na90;

.field public static final synthetic e:La/c0o;


# instance fields
.field public final a:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 1
    new-instance v0, La/na90;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const-string v2, "1"

    .line 5
    .line 6
    const-string v3, "PAYMENT_IMMEDIATELY"

    .line 7
    .line 8
    invoke-direct {v0, v3, v1, v2}, La/na90;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 9
    .line 10
    .line 11
    new-instance v1, La/na90;

    .line 12
    .line 13
    const/4 v2, 0x1

    .line 14
    const-string v3, "2"

    .line 15
    .line 16
    const-string v4, "PAYMENT_AFTER_ROLEPLAYING"

    .line 17
    .line 18
    invoke-direct {v1, v4, v2, v3}, La/na90;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 19
    .line 20
    .line 21
    new-instance v2, La/na90;

    .line 22
    .line 23
    const/4 v3, 0x2

    .line 24
    const-string v4, "3"

    .line 25
    .line 26
    const-string v5, "PAYMENT_AFTER_DEPOSIT"

    .line 27
    .line 28
    invoke-direct {v2, v5, v3, v4}, La/na90;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 29
    .line 30
    .line 31
    sput-object v2, La/na90;->b:La/na90;

    .line 32
    .line 33
    new-instance v3, La/na90;

    .line 34
    .line 35
    const/4 v4, 0x3

    .line 36
    const-string v5, "0"

    .line 37
    .line 38
    const-string v6, "UNKNOWN"

    .line 39
    .line 40
    invoke-direct {v3, v6, v4, v5}, La/na90;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 41
    .line 42
    .line 43
    sput-object v3, La/na90;->c:La/na90;

    .line 44
    .line 45
    filled-new-array {v0, v1, v2, v3}, [La/na90;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    sput-object v0, La/na90;->d:[La/na90;

    .line 50
    .line 51
    new-instance v1, La/c0o;

    .line 52
    .line 53
    invoke-direct {v1, v0}, La/c0o;-><init>([Ljava/lang/Enum;)V

    .line 54
    .line 55
    .line 56
    sput-object v1, La/na90;->e:La/c0o;

    .line 57
    .line 58
    new-instance v0, La/ma90;

    .line 59
    .line 60
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 61
    .line 62
    .line 63
    sput-object v0, La/na90;->Companion:La/ma90;

    .line 64
    .line 65
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    iput-object p3, p0, La/na90;->a:Ljava/lang/String;

    .line 5
    .line 6
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)La/na90;
    .locals 1

    .line 1
    const-class v0, La/na90;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/na90;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[La/na90;
    .locals 1

    .line 1
    sget-object v0, La/na90;->d:[La/na90;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [La/na90;

    .line 8
    .line 9
    return-object v0
.end method
