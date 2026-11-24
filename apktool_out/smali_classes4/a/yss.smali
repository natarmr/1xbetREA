.class public final synthetic La/yss;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:La/mm40;

.field public final synthetic b:La/l7m0;

.field public final synthetic c:La/sek;

.field public final synthetic d:La/bek;

.field public final synthetic e:J

.field public final synthetic f:J

.field public final synthetic g:Z

.field public final synthetic h:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(La/mm40;La/l7m0;La/sek;La/bek;JJZLkotlin/jvm/functions/Function1;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/yss;->a:La/mm40;

    iput-object p2, p0, La/yss;->b:La/l7m0;

    iput-object p3, p0, La/yss;->c:La/sek;

    iput-object p4, p0, La/yss;->d:La/bek;

    iput-wide p5, p0, La/yss;->e:J

    iput-wide p7, p0, La/yss;->f:J

    iput-boolean p9, p0, La/yss;->g:Z

    iput-object p10, p0, La/yss;->h:Lkotlin/jvm/functions/Function1;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    move-object v10, p1

    .line 2
    check-cast v10, La/fet;

    .line 3
    .line 4
    check-cast p2, Ljava/lang/Integer;

    .line 5
    .line 6
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    const/4 p1, 0x1

    .line 10
    invoke-static {p1}, La/x8x;->L(I)I

    .line 11
    .line 12
    .line 13
    move-result v11

    .line 14
    iget-object v0, p0, La/yss;->a:La/mm40;

    .line 15
    .line 16
    iget-object v1, p0, La/yss;->b:La/l7m0;

    .line 17
    .line 18
    iget-object v2, p0, La/yss;->c:La/sek;

    .line 19
    .line 20
    iget-object v3, p0, La/yss;->d:La/bek;

    .line 21
    .line 22
    iget-wide v4, p0, La/yss;->e:J

    .line 23
    .line 24
    iget-wide v6, p0, La/yss;->f:J

    .line 25
    .line 26
    iget-boolean v8, p0, La/yss;->g:Z

    .line 27
    .line 28
    iget-object v9, p0, La/yss;->h:Lkotlin/jvm/functions/Function1;

    .line 29
    .line 30
    invoke-static/range {v0 .. v11}, La/zss;->b(La/mm40;La/l7m0;La/sek;La/bek;JJZLkotlin/jvm/functions/Function1;La/fet;I)V

    .line 31
    .line 32
    .line 33
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 34
    .line 35
    return-object p0
.end method
