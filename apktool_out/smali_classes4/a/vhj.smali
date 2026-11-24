.class public final La/vhj;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/kmq;


# instance fields
.field public final synthetic a:La/kmq;

.field public final synthetic b:La/uii;

.field public final synthetic c:I

.field public final synthetic d:Z

.field public final synthetic e:J

.field public final synthetic f:Z

.field public final synthetic g:Z

.field public final synthetic h:Z

.field public final synthetic i:Z


# direct methods
.method public constructor <init>(La/kmq;La/uii;IZJZZZZ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, La/vhj;->b:La/uii;

    .line 5
    .line 6
    iput p3, p0, La/vhj;->c:I

    .line 7
    .line 8
    iput-boolean p4, p0, La/vhj;->d:Z

    .line 9
    .line 10
    iput-wide p5, p0, La/vhj;->e:J

    .line 11
    .line 12
    iput-boolean p7, p0, La/vhj;->f:Z

    .line 13
    .line 14
    iput-boolean p8, p0, La/vhj;->g:Z

    .line 15
    .line 16
    iput-boolean p9, p0, La/vhj;->h:Z

    .line 17
    .line 18
    iput-boolean p10, p0, La/vhj;->i:Z

    .line 19
    .line 20
    iput-object p1, p0, La/vhj;->a:La/kmq;

    .line 21
    .line 22
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;La/yje;)Ljava/lang/Object;
    .locals 10

    .line 1
    check-cast p1, La/nqo;

    .line 2
    .line 3
    if-eqz p1, :cond_1

    .line 4
    .line 5
    sget-object v0, La/lqo;->a:La/lqo;

    .line 6
    .line 7
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    iget-object p0, p0, La/vhj;->a:La/kmq;

    .line 15
    .line 16
    invoke-interface {p0, p1, p2}, La/kmq;->a(Ljava/lang/Object;La/yje;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    sget-object p1, La/wne;->a:La/wne;

    .line 21
    .line 22
    if-ne p0, p1, :cond_2

    .line 23
    .line 24
    return-object p0

    .line 25
    :cond_1
    :goto_0
    iget-boolean v7, p0, La/vhj;->h:Z

    .line 26
    .line 27
    iget-boolean v8, p0, La/vhj;->i:Z

    .line 28
    .line 29
    iget-object v0, p0, La/vhj;->b:La/uii;

    .line 30
    .line 31
    iget v1, p0, La/vhj;->c:I

    .line 32
    .line 33
    iget-boolean v2, p0, La/vhj;->d:Z

    .line 34
    .line 35
    iget-wide v3, p0, La/vhj;->e:J

    .line 36
    .line 37
    iget-boolean v5, p0, La/vhj;->f:Z

    .line 38
    .line 39
    iget-boolean v6, p0, La/vhj;->g:Z

    .line 40
    .line 41
    move-object v9, p2

    .line 42
    invoke-virtual/range {v0 .. v9}, La/uii;->m(IZJZZZZLa/yje;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    sget-object p1, La/wne;->a:La/wne;

    .line 47
    .line 48
    if-ne p0, p1, :cond_2

    .line 49
    .line 50
    return-object p0

    .line 51
    :cond_2
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 52
    .line 53
    return-object p0
.end method
