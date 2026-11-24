.class public final synthetic La/u9m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:La/q9m;

.field public final synthetic b:La/a4x;

.field public final synthetic c:J

.field public final synthetic d:J

.field public final synthetic e:J

.field public final synthetic f:J

.field public final synthetic g:J


# direct methods
.method public synthetic constructor <init>(La/q9m;La/a4x;JJJJJI)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/u9m;->a:La/q9m;

    iput-object p2, p0, La/u9m;->b:La/a4x;

    iput-wide p3, p0, La/u9m;->c:J

    iput-wide p5, p0, La/u9m;->d:J

    iput-wide p7, p0, La/u9m;->e:J

    iput-wide p9, p0, La/u9m;->f:J

    iput-wide p11, p0, La/u9m;->g:J

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v12, p1

    .line 4
    .line 5
    check-cast v12, La/fet;

    .line 6
    .line 7
    move-object/from16 v1, p2

    .line 8
    .line 9
    check-cast v1, Ljava/lang/Integer;

    .line 10
    .line 11
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    const/4 v1, 0x1

    .line 15
    invoke-static {v1}, La/x8x;->L(I)I

    .line 16
    .line 17
    .line 18
    move-result v13

    .line 19
    iget-object v1, v0, La/u9m;->a:La/q9m;

    .line 20
    .line 21
    move-object v2, v1

    .line 22
    iget-object v1, v0, La/u9m;->b:La/a4x;

    .line 23
    .line 24
    move-object v4, v2

    .line 25
    iget-wide v2, v0, La/u9m;->c:J

    .line 26
    .line 27
    move-object v6, v4

    .line 28
    iget-wide v4, v0, La/u9m;->d:J

    .line 29
    .line 30
    move-object v8, v6

    .line 31
    iget-wide v6, v0, La/u9m;->e:J

    .line 32
    .line 33
    move-object v10, v8

    .line 34
    iget-wide v8, v0, La/u9m;->f:J

    .line 35
    .line 36
    iget-wide v14, v0, La/u9m;->g:J

    .line 37
    .line 38
    move-object v0, v10

    .line 39
    move-wide v10, v14

    .line 40
    invoke-static/range {v0 .. v13}, La/ibc;->u(La/q9m;La/a4x;JJJJJLa/fet;I)V

    .line 41
    .line 42
    .line 43
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 44
    .line 45
    return-object v0
.end method
