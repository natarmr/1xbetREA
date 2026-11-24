.class public final synthetic La/jrh;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:La/mm40;

.field public final synthetic b:La/mm40;

.field public final synthetic c:Ljava/lang/String;

.field public final synthetic d:I

.field public final synthetic e:J

.field public final synthetic f:La/qge;

.field public final synthetic g:I

.field public final synthetic h:Z


# direct methods
.method public synthetic constructor <init>(La/mm40;La/mm40;Ljava/lang/String;IJLa/qge;II)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/jrh;->a:La/mm40;

    iput-object p2, p0, La/jrh;->b:La/mm40;

    iput-object p3, p0, La/jrh;->c:Ljava/lang/String;

    iput p4, p0, La/jrh;->d:I

    iput-wide p5, p0, La/jrh;->e:J

    iput-object p7, p0, La/jrh;->f:La/qge;

    iput p8, p0, La/jrh;->g:I

    iput-boolean p9, p0, La/jrh;->h:Z

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    move-object v7, p1

    .line 2
    check-cast v7, La/fet;

    .line 3
    .line 4
    check-cast p2, Ljava/lang/Integer;

    .line 5
    .line 6
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    iget p1, p0, La/jrh;->g:I

    .line 10
    .line 11
    or-int/lit8 p1, p1, 0x1

    .line 12
    .line 13
    invoke-static {p1}, La/x8x;->L(I)I

    .line 14
    .line 15
    .line 16
    move-result v8

    .line 17
    iget-object v0, p0, La/jrh;->a:La/mm40;

    .line 18
    .line 19
    iget-object v1, p0, La/jrh;->b:La/mm40;

    .line 20
    .line 21
    iget-object v2, p0, La/jrh;->c:Ljava/lang/String;

    .line 22
    .line 23
    iget v3, p0, La/jrh;->d:I

    .line 24
    .line 25
    iget-wide v4, p0, La/jrh;->e:J

    .line 26
    .line 27
    iget-object v6, p0, La/jrh;->f:La/qge;

    .line 28
    .line 29
    iget-boolean v9, p0, La/jrh;->h:Z

    .line 30
    .line 31
    invoke-static/range {v0 .. v9}, La/lgb;->v(La/mm40;La/mm40;Ljava/lang/String;IJLa/qge;La/fet;II)V

    .line 32
    .line 33
    .line 34
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 35
    .line 36
    return-object p0
.end method
