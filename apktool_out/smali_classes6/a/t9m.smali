.class public final synthetic La/t9m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:La/r9m;

.field public final synthetic b:La/a4x;

.field public final synthetic c:J

.field public final synthetic d:J

.field public final synthetic e:J

.field public final synthetic f:J


# direct methods
.method public synthetic constructor <init>(La/r9m;La/a4x;JJJJI)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/t9m;->a:La/r9m;

    iput-object p2, p0, La/t9m;->b:La/a4x;

    iput-wide p3, p0, La/t9m;->c:J

    iput-wide p5, p0, La/t9m;->d:J

    iput-wide p7, p0, La/t9m;->e:J

    iput-wide p9, p0, La/t9m;->f:J

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
    iget-object v0, p0, La/t9m;->a:La/r9m;

    .line 15
    .line 16
    iget-object v1, p0, La/t9m;->b:La/a4x;

    .line 17
    .line 18
    iget-wide v2, p0, La/t9m;->c:J

    .line 19
    .line 20
    iget-wide v4, p0, La/t9m;->d:J

    .line 21
    .line 22
    iget-wide v6, p0, La/t9m;->e:J

    .line 23
    .line 24
    iget-wide v8, p0, La/t9m;->f:J

    .line 25
    .line 26
    invoke-static/range {v0 .. v11}, La/ibc;->v(La/r9m;La/a4x;JJJJLa/fet;I)V

    .line 27
    .line 28
    .line 29
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 30
    .line 31
    return-object p0
.end method
