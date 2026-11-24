.class public final enum La/gsj0;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final synthetic c:[La/gsj0;

.field public static final synthetic d:La/c0o;


# instance fields
.field public final a:I

.field public final b:La/aph;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 1
    new-instance v0, La/gsj0;

    .line 2
    .line 3
    const v1, 0x7f1316e0

    .line 4
    .line 5
    .line 6
    sget-object v2, La/aph;->a:La/aph;

    .line 7
    .line 8
    const-string v3, "HEAD"

    .line 9
    .line 10
    const/4 v4, 0x0

    .line 11
    invoke-direct {v0, v3, v4, v1, v2}, La/gsj0;-><init>(Ljava/lang/String;IILa/aph;)V

    .line 12
    .line 13
    .line 14
    new-instance v1, La/gsj0;

    .line 15
    .line 16
    const v2, 0x7f1316dc

    .line 17
    .line 18
    .line 19
    sget-object v3, La/aph;->b:La/aph;

    .line 20
    .line 21
    const-string v4, "BODY"

    .line 22
    .line 23
    const/4 v5, 0x1

    .line 24
    invoke-direct {v1, v4, v5, v2, v3}, La/gsj0;-><init>(Ljava/lang/String;IILa/aph;)V

    .line 25
    .line 26
    .line 27
    new-instance v2, La/gsj0;

    .line 28
    .line 29
    const v3, 0x7f1316e1

    .line 30
    .line 31
    .line 32
    sget-object v4, La/aph;->c:La/aph;

    .line 33
    .line 34
    const-string v5, "LEGS"

    .line 35
    .line 36
    const/4 v6, 0x2

    .line 37
    invoke-direct {v2, v5, v6, v3, v4}, La/gsj0;-><init>(Ljava/lang/String;IILa/aph;)V

    .line 38
    .line 39
    .line 40
    filled-new-array {v0, v1, v2}, [La/gsj0;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    sput-object v0, La/gsj0;->c:[La/gsj0;

    .line 45
    .line 46
    new-instance v1, La/c0o;

    .line 47
    .line 48
    invoke-direct {v1, v0}, La/c0o;-><init>([Ljava/lang/Enum;)V

    .line 49
    .line 50
    .line 51
    sput-object v1, La/gsj0;->d:La/c0o;

    .line 52
    .line 53
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;IILa/aph;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    iput p3, p0, La/gsj0;->a:I

    .line 5
    .line 6
    iput-object p4, p0, La/gsj0;->b:La/aph;

    .line 7
    .line 8
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)La/gsj0;
    .locals 1

    .line 1
    const-class v0, La/gsj0;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/gsj0;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[La/gsj0;
    .locals 1

    .line 1
    sget-object v0, La/gsj0;->c:[La/gsj0;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [La/gsj0;

    .line 8
    .line 9
    return-object v0
.end method
