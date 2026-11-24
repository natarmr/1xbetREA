.class public final synthetic La/y9m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:La/mm40;

.field public final synthetic b:La/a4x;

.field public final synthetic c:La/a4x;

.field public final synthetic d:J

.field public final synthetic e:J

.field public final synthetic f:J

.field public final synthetic g:J

.field public final synthetic h:I


# direct methods
.method public synthetic constructor <init>(La/mm40;La/a4x;La/a4x;JJJJI)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/y9m;->a:La/mm40;

    iput-object p2, p0, La/y9m;->b:La/a4x;

    iput-object p3, p0, La/y9m;->c:La/a4x;

    iput-wide p4, p0, La/y9m;->d:J

    iput-wide p6, p0, La/y9m;->e:J

    iput-wide p8, p0, La/y9m;->f:J

    iput-wide p10, p0, La/y9m;->g:J

    iput p12, p0, La/y9m;->h:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    .line 1
    move-object v11, p1

    .line 2
    check-cast v11, La/fet;

    .line 3
    .line 4
    check-cast p2, Ljava/lang/Integer;

    .line 5
    .line 6
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    iget p1, p0, La/y9m;->h:I

    .line 10
    .line 11
    or-int/lit8 p1, p1, 0x1

    .line 12
    .line 13
    invoke-static {p1}, La/x8x;->L(I)I

    .line 14
    .line 15
    .line 16
    move-result v12

    .line 17
    iget-object v0, p0, La/y9m;->a:La/mm40;

    .line 18
    .line 19
    iget-object v1, p0, La/y9m;->b:La/a4x;

    .line 20
    .line 21
    iget-object v2, p0, La/y9m;->c:La/a4x;

    .line 22
    .line 23
    iget-wide v3, p0, La/y9m;->d:J

    .line 24
    .line 25
    iget-wide v5, p0, La/y9m;->e:J

    .line 26
    .line 27
    iget-wide v7, p0, La/y9m;->f:J

    .line 28
    .line 29
    iget-wide v9, p0, La/y9m;->g:J

    .line 30
    .line 31
    invoke-static/range {v0 .. v12}, La/ibc;->Q(La/mm40;La/a4x;La/a4x;JJJJLa/fet;I)V

    .line 32
    .line 33
    .line 34
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 35
    .line 36
    return-object p0
.end method
