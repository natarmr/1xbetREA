.class public final synthetic La/ljb0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:La/tjb0;

.field public final synthetic b:Z

.field public final synthetic c:La/f9h0;

.field public final synthetic d:Ljava/util/Set;

.field public final synthetic e:J

.field public final synthetic f:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(La/tjb0;ZLa/f9h0;Ljava/util/Set;JLjava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/ljb0;->a:La/tjb0;

    iput-boolean p2, p0, La/ljb0;->b:Z

    iput-object p3, p0, La/ljb0;->c:La/f9h0;

    iput-object p4, p0, La/ljb0;->d:Ljava/util/Set;

    iput-wide p5, p0, La/ljb0;->e:J

    iput-object p7, p0, La/ljb0;->f:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    check-cast p1, La/k0w0;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, La/ljb0;->a:La/tjb0;

    .line 7
    .line 8
    iget-object v1, v0, La/tjb0;->l:La/vjp;

    .line 9
    .line 10
    iget-boolean v0, p0, La/ljb0;->b:Z

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    sget-object v0, La/j700;->b:La/j700;

    .line 15
    .line 16
    :goto_0
    move-object v2, v0

    .line 17
    goto :goto_1

    .line 18
    :cond_0
    sget-object v0, La/j700;->a:La/j700;

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :goto_1
    iget-object v3, p0, La/ljb0;->c:La/f9h0;

    .line 22
    .line 23
    iget-object v4, p0, La/ljb0;->d:Ljava/util/Set;

    .line 24
    .line 25
    iget-wide v5, p0, La/ljb0;->e:J

    .line 26
    .line 27
    iget-object v7, p0, La/ljb0;->f:Ljava/lang/String;

    .line 28
    .line 29
    invoke-virtual/range {v1 .. v7}, La/vjp;->b(La/j700;La/f9h0;Ljava/util/Set;JLjava/lang/String;)Lcom/github/terrakok/cicerone/androidx/FragmentScreen;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    invoke-virtual {p1, p0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 34
    .line 35
    .line 36
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 37
    .line 38
    return-object p0
.end method
