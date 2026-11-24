.class public abstract La/t400;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ljava/util/List;

.field public static final b:Ljava/util/List;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    sget-object v0, La/bnz;->c:La/bnz;

    .line 2
    .line 3
    sget-object v1, La/bnz;->a:La/bnz;

    .line 4
    .line 5
    sget-object v2, La/bnz;->b:La/bnz;

    .line 6
    .line 7
    filled-new-array {v0, v1, v2}, [La/bnz;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-static {v0}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    sput-object v0, La/t400;->a:Ljava/util/List;

    .line 16
    .line 17
    sget-object v0, La/bnz;->g:La/bnz;

    .line 18
    .line 19
    sget-object v1, La/bnz;->e:La/bnz;

    .line 20
    .line 21
    filled-new-array {v0, v1}, [La/bnz;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-static {v0}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    sput-object v0, La/t400;->b:Ljava/util/List;

    .line 30
    .line 31
    return-void
.end method

.method public static final a(IIZ)La/wui0;
    .locals 0

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    if-eqz p2, :cond_0

    .line 4
    .line 5
    sget-object p0, La/wui0;->b:La/wui0;

    .line 6
    .line 7
    return-object p0

    .line 8
    :cond_0
    if-nez p1, :cond_1

    .line 9
    .line 10
    sget-object p0, La/wui0;->a:La/wui0;

    .line 11
    .line 12
    return-object p0

    .line 13
    :cond_1
    if-nez p0, :cond_2

    .line 14
    .line 15
    sget-object p0, La/wui0;->b:La/wui0;

    .line 16
    .line 17
    return-object p0

    .line 18
    :cond_2
    if-ne p0, p1, :cond_3

    .line 19
    .line 20
    if-eqz p2, :cond_3

    .line 21
    .line 22
    sget-object p0, La/wui0;->c:La/wui0;

    .line 23
    .line 24
    return-object p0

    .line 25
    :cond_3
    if-ne p0, p1, :cond_4

    .line 26
    .line 27
    sget-object p0, La/wui0;->d:La/wui0;

    .line 28
    .line 29
    return-object p0

    .line 30
    :cond_4
    sget-object p0, La/wui0;->c:La/wui0;

    .line 31
    .line 32
    return-object p0
.end method
