.class public final synthetic La/v0m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:La/mm40;

.field public final synthetic b:I

.field public final synthetic c:J

.field public final synthetic d:J

.field public final synthetic e:F

.field public final synthetic f:F

.field public final synthetic g:I


# direct methods
.method public synthetic constructor <init>(La/mm40;IJJFFI)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/v0m;->a:La/mm40;

    iput p2, p0, La/v0m;->b:I

    iput-wide p3, p0, La/v0m;->c:J

    iput-wide p5, p0, La/v0m;->d:J

    iput p7, p0, La/v0m;->e:F

    iput p8, p0, La/v0m;->f:F

    iput p9, p0, La/v0m;->g:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    move-object v8, p1

    .line 2
    check-cast v8, La/fet;

    .line 3
    .line 4
    check-cast p2, Ljava/lang/Integer;

    .line 5
    .line 6
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    iget p1, p0, La/v0m;->g:I

    .line 10
    .line 11
    or-int/lit8 p1, p1, 0x1

    .line 12
    .line 13
    invoke-static {p1}, La/x8x;->L(I)I

    .line 14
    .line 15
    .line 16
    move-result v9

    .line 17
    iget-object v0, p0, La/v0m;->a:La/mm40;

    .line 18
    .line 19
    iget v1, p0, La/v0m;->b:I

    .line 20
    .line 21
    iget-wide v2, p0, La/v0m;->c:J

    .line 22
    .line 23
    iget-wide v4, p0, La/v0m;->d:J

    .line 24
    .line 25
    iget v6, p0, La/v0m;->e:F

    .line 26
    .line 27
    iget v7, p0, La/v0m;->f:F

    .line 28
    .line 29
    invoke-static/range {v0 .. v9}, La/agc;->e(La/mm40;IJJFFLa/fet;I)V

    .line 30
    .line 31
    .line 32
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 33
    .line 34
    return-object p0
.end method
