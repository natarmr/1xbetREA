.class public final La/k820;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final e:Ljava/util/List;


# instance fields
.field public final a:La/mii0;

.field public final b:La/zr1;

.field public final c:La/duj;

.field public final d:La/mh20;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    sget-object v0, La/i2o;->A:La/i2o;

    .line 2
    .line 3
    sget-object v1, La/i2o;->B:La/i2o;

    .line 4
    .line 5
    sget-object v2, La/i2o;->t:La/i2o;

    .line 6
    .line 7
    filled-new-array {v0, v1, v2}, [La/i2o;

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
    sput-object v0, La/k820;->e:Ljava/util/List;

    .line 16
    .line 17
    return-void
.end method

.method public constructor <init>(La/mii0;La/zr1;La/duj;La/mh20;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/k820;->a:La/mii0;

    .line 5
    .line 6
    iput-object p2, p0, La/k820;->b:La/zr1;

    .line 7
    .line 8
    iput-object p3, p0, La/k820;->c:La/duj;

    .line 9
    .line 10
    iput-object p4, p0, La/k820;->d:La/mh20;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Throwable;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, La/b120;

    .line 5
    .line 6
    const/4 v1, 0x2

    .line 7
    invoke-direct {v0, p0, v1}, La/b120;-><init>(Ljava/lang/Object;B)V

    .line 8
    .line 9
    .line 10
    iget-object p0, p0, La/k820;->c:La/duj;

    .line 11
    .line 12
    invoke-virtual {p0, p1, v0}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method
