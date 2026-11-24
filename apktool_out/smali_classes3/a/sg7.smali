.class public final La/sg7;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime La/ahi0;
.end annotation


# static fields
.field public static final Companion:La/og7;

.field public static final f:[La/a8z;


# instance fields
.field public final a:Ljava/util/List;

.field public final b:La/ng7;

.field public final c:Ljava/lang/String;

.field public final d:Z

.field public final e:La/kuw;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, La/og7;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, La/sg7;->Companion:La/og7;

    .line 7
    .line 8
    sget-object v0, La/wez;->a:La/wez;

    .line 9
    .line 10
    new-instance v1, La/t07;

    .line 11
    .line 12
    const/16 v2, 0x15

    .line 13
    .line 14
    invoke-direct {v1, v2}, La/t07;-><init>(B)V

    .line 15
    .line 16
    .line 17
    invoke-static {v0, v1}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    new-instance v2, La/t07;

    .line 22
    .line 23
    const/16 v3, 0x16

    .line 24
    .line 25
    invoke-direct {v2, v3}, La/t07;-><init>(B)V

    .line 26
    .line 27
    .line 28
    invoke-static {v0, v2}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    const/4 v2, 0x5

    .line 33
    new-array v2, v2, [La/a8z;

    .line 34
    .line 35
    const/4 v3, 0x0

    .line 36
    aput-object v1, v2, v3

    .line 37
    .line 38
    const/4 v1, 0x1

    .line 39
    const/4 v3, 0x0

    .line 40
    aput-object v3, v2, v1

    .line 41
    .line 42
    const/4 v1, 0x2

    .line 43
    aput-object v3, v2, v1

    .line 44
    .line 45
    const/4 v1, 0x3

    .line 46
    aput-object v3, v2, v1

    .line 47
    .line 48
    const/4 v1, 0x4

    .line 49
    aput-object v0, v2, v1

    .line 50
    .line 51
    sput-object v2, La/sg7;->f:[La/a8z;

    .line 52
    .line 53
    return-void
.end method

.method public synthetic constructor <init>(ILjava/util/List;La/ng7;Ljava/lang/String;ZLa/kuw;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    and-int/lit8 v0, p1, 0x1

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    iput-object v1, p0, La/sg7;->a:Ljava/util/List;

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    iput-object p2, p0, La/sg7;->a:Ljava/util/List;

    .line 13
    .line 14
    :goto_0
    and-int/lit8 p2, p1, 0x2

    .line 15
    .line 16
    if-nez p2, :cond_1

    .line 17
    .line 18
    iput-object v1, p0, La/sg7;->b:La/ng7;

    .line 19
    .line 20
    goto :goto_1

    .line 21
    :cond_1
    iput-object p3, p0, La/sg7;->b:La/ng7;

    .line 22
    .line 23
    :goto_1
    and-int/lit8 p2, p1, 0x4

    .line 24
    .line 25
    if-nez p2, :cond_2

    .line 26
    .line 27
    const-string p2, ""

    .line 28
    .line 29
    iput-object p2, p0, La/sg7;->c:Ljava/lang/String;

    .line 30
    .line 31
    goto :goto_2

    .line 32
    :cond_2
    iput-object p4, p0, La/sg7;->c:Ljava/lang/String;

    .line 33
    .line 34
    :goto_2
    and-int/lit8 p2, p1, 0x8

    .line 35
    .line 36
    if-nez p2, :cond_3

    .line 37
    .line 38
    const/4 p2, 0x0

    .line 39
    iput-boolean p2, p0, La/sg7;->d:Z

    .line 40
    .line 41
    goto :goto_3

    .line 42
    :cond_3
    iput-boolean p5, p0, La/sg7;->d:Z

    .line 43
    .line 44
    :goto_3
    and-int/lit8 p1, p1, 0x10

    .line 45
    .line 46
    if-nez p1, :cond_4

    .line 47
    .line 48
    iput-object v1, p0, La/sg7;->e:La/kuw;

    .line 49
    .line 50
    return-void

    .line 51
    :cond_4
    iput-object p6, p0, La/sg7;->e:La/kuw;

    .line 52
    .line 53
    return-void
.end method


# virtual methods
.method public final a()Ljava/util/List;
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    iget-object v1, p0, La/sg7;->c:Ljava/lang/String;

    .line 3
    .line 4
    if-eqz v1, :cond_1

    .line 5
    .line 6
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 7
    .line 8
    .line 9
    move-result v2

    .line 10
    if-gtz v2, :cond_0

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    new-instance v2, La/zhi0;

    .line 14
    .line 15
    iget-object p0, p0, La/sg7;->e:La/kuw;

    .line 16
    .line 17
    const/16 v3, 0xc

    .line 18
    .line 19
    invoke-direct {v2, v1, p0, v0, v3}, La/zhi0;-><init>(Ljava/lang/String;La/kuw;Ljava/lang/Integer;I)V

    .line 20
    .line 21
    .line 22
    throw v2

    .line 23
    :cond_1
    :goto_0
    iget-object p0, p0, La/sg7;->a:Ljava/util/List;

    .line 24
    .line 25
    if-eqz p0, :cond_2

    .line 26
    .line 27
    return-object p0

    .line 28
    :cond_2
    invoke-static {v0}, La/jf4;->k(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    return-object v0
.end method
