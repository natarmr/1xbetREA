.class public final synthetic La/g36;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:La/mm40;

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:Ljava/lang/String;

.field public final synthetic d:Z

.field public final synthetic e:Z

.field public final synthetic f:Z

.field public final synthetic g:La/hh80;

.field public final synthetic h:La/q7q0;

.field public final synthetic i:I

.field public final synthetic j:I


# direct methods
.method public synthetic constructor <init>(La/mm40;Ljava/lang/String;Ljava/lang/String;ZZZLa/hh80;La/q7q0;II)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/g36;->a:La/mm40;

    iput-object p2, p0, La/g36;->b:Ljava/lang/String;

    iput-object p3, p0, La/g36;->c:Ljava/lang/String;

    iput-boolean p4, p0, La/g36;->d:Z

    iput-boolean p5, p0, La/g36;->e:Z

    iput-boolean p6, p0, La/g36;->f:Z

    iput-object p7, p0, La/g36;->g:La/hh80;

    iput-object p8, p0, La/g36;->h:La/q7q0;

    iput p9, p0, La/g36;->i:I

    iput p10, p0, La/g36;->j:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    move-object v9, p1

    .line 2
    check-cast v9, La/fet;

    .line 3
    .line 4
    check-cast p2, Ljava/lang/Integer;

    .line 5
    .line 6
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    iget p1, p0, La/g36;->j:I

    .line 10
    .line 11
    or-int/lit8 p1, p1, 0x1

    .line 12
    .line 13
    invoke-static {p1}, La/x8x;->L(I)I

    .line 14
    .line 15
    .line 16
    move-result v10

    .line 17
    iget-object v0, p0, La/g36;->a:La/mm40;

    .line 18
    .line 19
    iget-object v1, p0, La/g36;->b:Ljava/lang/String;

    .line 20
    .line 21
    iget-object v2, p0, La/g36;->c:Ljava/lang/String;

    .line 22
    .line 23
    iget-boolean v3, p0, La/g36;->d:Z

    .line 24
    .line 25
    iget-boolean v4, p0, La/g36;->e:Z

    .line 26
    .line 27
    iget-boolean v5, p0, La/g36;->f:Z

    .line 28
    .line 29
    iget-object v6, p0, La/g36;->g:La/hh80;

    .line 30
    .line 31
    iget-object v7, p0, La/g36;->h:La/q7q0;

    .line 32
    .line 33
    iget v8, p0, La/g36;->i:I

    .line 34
    .line 35
    invoke-static/range {v0 .. v10}, La/h36;->d(La/mm40;Ljava/lang/String;Ljava/lang/String;ZZZLa/hh80;La/q7q0;ILa/fet;I)V

    .line 36
    .line 37
    .line 38
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 39
    .line 40
    return-object p0
.end method
