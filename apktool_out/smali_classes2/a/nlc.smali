.class public final La/nlc;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final c:Ljava/util/Set;


# instance fields
.field public final a:La/f6i;

.field public final b:La/xg;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    sget-object v0, La/i4m0;->c:La/twq;

    .line 2
    .line 3
    invoke-virtual {v0}, La/twq;->i()La/swq;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    new-instance v1, La/qlc;

    .line 8
    .line 9
    invoke-virtual {v0}, La/swq;->b()La/swq;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    iget-object v0, v0, La/swq;->a:La/twq;

    .line 14
    .line 15
    invoke-virtual {v0}, La/twq;->g()La/g950;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-direct {v1, v2, v0}, La/qlc;-><init>(La/swq;La/g950;)V

    .line 20
    .line 21
    .line 22
    invoke-static {v1}, La/cui0;->b(Ljava/lang/Object;)Ljava/util/Set;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    sput-object v0, La/nlc;->c:Ljava/util/Set;

    .line 27
    .line 28
    return-void
.end method

.method public constructor <init>(La/f6i;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/nlc;->a:La/f6i;

    .line 5
    .line 6
    iget-object p1, p1, La/f6i;->e:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p1, La/eu00;

    .line 9
    .line 10
    new-instance v0, La/w0;

    .line 11
    .line 12
    const/16 v1, 0xe

    .line 13
    .line 14
    invoke-direct {v0, p0, v1}, La/w0;-><init>(Ljava/lang/Object;B)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p1, v0}, La/eu00;->d(Lkotlin/jvm/functions/Function1;)La/xg;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    iput-object p1, p0, La/nlc;->b:La/xg;

    .line 22
    .line 23
    return-void
.end method


# virtual methods
.method public final a(La/qlc;La/glc;)La/wm40;
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, La/mlc;

    .line 5
    .line 6
    invoke-direct {v0, p1, p2}, La/mlc;-><init>(La/qlc;La/glc;)V

    .line 7
    .line 8
    .line 9
    iget-object p0, p0, La/nlc;->b:La/xg;

    .line 10
    .line 11
    invoke-virtual {p0, v0}, La/xg;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    check-cast p0, La/wm40;

    .line 16
    .line 17
    return-object p0
.end method
