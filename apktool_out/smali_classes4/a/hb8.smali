.class public final synthetic La/hb8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:I

.field public final synthetic c:La/rab;

.field public final synthetic d:Ljava/lang/String;

.field public final synthetic e:Ljava/lang/String;

.field public final synthetic f:La/cb8;

.field public final synthetic g:Z

.field public final synthetic h:I


# direct methods
.method public synthetic constructor <init>(IILa/rab;Ljava/lang/String;Ljava/lang/String;La/cb8;ZI)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, La/hb8;->a:I

    iput p2, p0, La/hb8;->b:I

    iput-object p3, p0, La/hb8;->c:La/rab;

    iput-object p4, p0, La/hb8;->d:Ljava/lang/String;

    iput-object p5, p0, La/hb8;->e:Ljava/lang/String;

    iput-object p6, p0, La/hb8;->f:La/cb8;

    iput-boolean p7, p0, La/hb8;->g:Z

    iput p8, p0, La/hb8;->h:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

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
    iget p1, p0, La/hb8;->h:I

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
    iget v0, p0, La/hb8;->a:I

    .line 18
    .line 19
    iget v1, p0, La/hb8;->b:I

    .line 20
    .line 21
    iget-object v2, p0, La/hb8;->c:La/rab;

    .line 22
    .line 23
    iget-object v3, p0, La/hb8;->d:Ljava/lang/String;

    .line 24
    .line 25
    iget-object v4, p0, La/hb8;->e:Ljava/lang/String;

    .line 26
    .line 27
    iget-object v5, p0, La/hb8;->f:La/cb8;

    .line 28
    .line 29
    iget-boolean v6, p0, La/hb8;->g:Z

    .line 30
    .line 31
    invoke-static/range {v0 .. v8}, La/dj8;->i(IILa/rab;Ljava/lang/String;Ljava/lang/String;La/cb8;ZLa/fet;I)V

    .line 32
    .line 33
    .line 34
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 35
    .line 36
    return-object p0
.end method
