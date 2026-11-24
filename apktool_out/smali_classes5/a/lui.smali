.class public final La/lui;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/q7d0;

.field public final b:La/vby;

.field public final c:Ljava/lang/String;

.field public final d:Ljava/lang/Integer;

.field public final e:La/sjl0;

.field public final f:La/n5d0;


# direct methods
.method public constructor <init>(La/q7d0;La/vby;La/sjl0;Ljava/lang/String;Ljava/lang/Integer;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/lui;->a:La/q7d0;

    .line 5
    .line 6
    iput-object p2, p0, La/lui;->b:La/vby;

    .line 7
    .line 8
    iput-object p4, p0, La/lui;->c:Ljava/lang/String;

    .line 9
    .line 10
    iput-object p5, p0, La/lui;->d:Ljava/lang/Integer;

    .line 11
    .line 12
    iput-object p3, p0, La/lui;->e:La/sjl0;

    .line 13
    .line 14
    new-instance p1, La/rti;

    .line 15
    .line 16
    const/4 p2, 0x6

    .line 17
    invoke-direct {p1, p0, p2}, La/rti;-><init>(Ljava/lang/Object;B)V

    .line 18
    .line 19
    .line 20
    invoke-static {p1}, La/mbl;->b(La/n5d0;)La/n5d0;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    iput-object p1, p0, La/lui;->f:La/n5d0;

    .line 25
    .line 26
    return-void
.end method


# virtual methods
.method public final a()La/ani0;
    .locals 1

    .line 1
    new-instance v0, La/ani0;

    .line 2
    .line 3
    iget-object p0, p0, La/lui;->f:La/n5d0;

    .line 4
    .line 5
    invoke-interface {p0}, La/o5d0;->get()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, La/v8l0;

    .line 10
    .line 11
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 15
    .line 16
    .line 17
    iput-object p0, v0, La/ani0;->a:Ljava/lang/Object;

    .line 18
    .line 19
    return-object v0
.end method
