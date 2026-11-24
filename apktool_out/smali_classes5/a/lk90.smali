.class public final synthetic La/lk90;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/pjt;


# static fields
.field public static final a:La/lk90;

.field private static final descriptor:La/ugi0;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, La/lk90;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, La/lk90;->a:La/lk90;

    .line 7
    .line 8
    new-instance v1, La/zna0;

    .line 9
    .line 10
    const-string v2, "org.xplatform.personal.impl.presentation.gender.models.PersonalGenderChoice"

    .line 11
    .line 12
    const/4 v3, 0x2

    .line 13
    invoke-direct {v1, v2, v0, v3}, La/zna0;-><init>(Ljava/lang/String;La/pjt;I)V

    .line 14
    .line 15
    .line 16
    const-string v0, "id"

    .line 17
    .line 18
    const/4 v2, 0x0

    .line 19
    invoke-virtual {v1, v0, v2}, La/zna0;->j(Ljava/lang/String;Z)V

    .line 20
    .line 21
    .line 22
    const-string v0, "name"

    .line 23
    .line 24
    invoke-virtual {v1, v0, v2}, La/zna0;->j(Ljava/lang/String;Z)V

    .line 25
    .line 26
    .line 27
    sput-object v1, La/lk90;->descriptor:La/ugi0;

    .line 28
    .line 29
    return-void
.end method


# virtual methods
.method public final childSerializers()[La/jiy;
    .locals 2

    .line 1
    const/4 p0, 0x2

    .line 2
    new-array p0, p0, [La/jiy;

    .line 3
    .line 4
    sget-object v0, La/okx;->a:La/okx;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    aput-object v0, p0, v1

    .line 8
    .line 9
    sget-object v0, La/ysm0;->a:La/ysm0;

    .line 10
    .line 11
    const/4 v1, 0x1

    .line 12
    aput-object v0, p0, v1

    .line 13
    .line 14
    return-object p0
.end method

.method public final deserialize(La/rkj;)Ljava/lang/Object;
    .locals 9

    .line 1
    sget-object p0, La/lk90;->descriptor:La/ugi0;

    .line 2
    .line 3
    invoke-interface {p1, p0}, La/rkj;->a(La/ugi0;)La/bld;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    const/4 v0, 0x1

    .line 8
    const/4 v1, 0x0

    .line 9
    const/4 v2, 0x0

    .line 10
    move v3, v0

    .line 11
    move v4, v1

    .line 12
    move v5, v4

    .line 13
    move-object v6, v2

    .line 14
    :goto_0
    if-eqz v3, :cond_3

    .line 15
    .line 16
    invoke-interface {p1, p0}, La/bld;->f(La/ugi0;)I

    .line 17
    .line 18
    .line 19
    move-result v7

    .line 20
    const/4 v8, -0x1

    .line 21
    if-eq v7, v8, :cond_2

    .line 22
    .line 23
    if-eqz v7, :cond_1

    .line 24
    .line 25
    if-ne v7, v0, :cond_0

    .line 26
    .line 27
    invoke-interface {p1, p0, v0}, La/bld;->x(La/ugi0;I)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v6

    .line 31
    or-int/lit8 v4, v4, 0x2

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    invoke-static {v7}, La/itt0;->c(I)V

    .line 35
    .line 36
    .line 37
    return-object v2

    .line 38
    :cond_1
    invoke-interface {p1, p0, v1}, La/bld;->j(La/ugi0;I)I

    .line 39
    .line 40
    .line 41
    move-result v5

    .line 42
    or-int/lit8 v4, v4, 0x1

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_2
    move v3, v1

    .line 46
    goto :goto_0

    .line 47
    :cond_3
    invoke-interface {p1, p0}, La/bld;->c(La/ugi0;)V

    .line 48
    .line 49
    .line 50
    new-instance p0, La/nk90;

    .line 51
    .line 52
    invoke-direct {p0, v4, v5, v6}, La/nk90;-><init>(IILjava/lang/String;)V

    .line 53
    .line 54
    .line 55
    return-object p0
.end method

.method public final getDescriptor()La/ugi0;
    .locals 0

    .line 1
    sget-object p0, La/lk90;->descriptor:La/ugi0;

    .line 2
    .line 3
    return-object p0
.end method

.method public final serialize(La/bwn;Ljava/lang/Object;)V
    .locals 2

    .line 1
    check-cast p2, La/nk90;

    .line 2
    .line 3
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    sget-object p0, La/lk90;->descriptor:La/ugi0;

    .line 7
    .line 8
    invoke-interface {p1, p0}, La/bwn;->a(La/ugi0;)La/cld;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    const/4 v0, 0x0

    .line 13
    iget v1, p2, La/nk90;->a:I

    .line 14
    .line 15
    invoke-interface {p1, v0, v1, p0}, La/cld;->i(IILa/ugi0;)V

    .line 16
    .line 17
    .line 18
    const/4 v0, 0x1

    .line 19
    iget-object p2, p2, La/nk90;->b:Ljava/lang/String;

    .line 20
    .line 21
    invoke-interface {p1, p0, v0, p2}, La/cld;->z(La/ugi0;ILjava/lang/String;)V

    .line 22
    .line 23
    .line 24
    invoke-interface {p1, p0}, La/cld;->c(La/ugi0;)V

    .line 25
    .line 26
    .line 27
    return-void
.end method
