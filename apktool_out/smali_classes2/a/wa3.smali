.class public final La/wa3;
.super La/p4;
.source "SourceFile"


# instance fields
.field public final c:La/s1o;

.field public final d:La/gfk0;


# direct methods
.method public constructor <init>(La/vkr0;La/s1o;La/svt0;La/gfk0;)V
    .locals 0

    .line 1
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const/4 p3, 0x3

    .line 5
    invoke-direct {p0, p1, p3}, La/p4;-><init>(Ljava/lang/Object;B)V

    .line 6
    .line 7
    .line 8
    iput-object p2, p0, La/wa3;->c:La/s1o;

    .line 9
    .line 10
    iput-object p4, p0, La/wa3;->d:La/gfk0;

    .line 11
    .line 12
    new-instance p1, La/sz2;

    .line 13
    .line 14
    invoke-direct {p1, p0, p3}, La/sz2;-><init>(Ljava/lang/Object;B)V

    .line 15
    .line 16
    .line 17
    invoke-static {p1}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 18
    .line 19
    .line 20
    return-void
.end method


# virtual methods
.method public final q0(La/td9;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, La/wa3;->d:La/gfk0;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, La/wa3;->c:La/s1o;

    .line 7
    .line 8
    invoke-virtual {p0, p1}, La/s1o;->q0(La/td9;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    return-object p0
.end method
