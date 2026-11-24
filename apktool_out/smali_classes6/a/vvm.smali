.class public final synthetic La/vvm;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:La/mm40;

.field public final synthetic b:La/vum;

.field public final synthetic c:La/vum;

.field public final synthetic d:La/a2m;

.field public final synthetic e:Ljava/lang/String;

.field public final synthetic f:Ljava/lang/String;

.field public final synthetic g:La/mum;

.field public final synthetic h:Z

.field public final synthetic i:B


# direct methods
.method public synthetic constructor <init>(La/mm40;La/vum;La/vum;La/a2m;Ljava/lang/String;Ljava/lang/String;La/mum;ZI)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/vvm;->a:La/mm40;

    iput-object p2, p0, La/vvm;->b:La/vum;

    iput-object p3, p0, La/vvm;->c:La/vum;

    iput-object p4, p0, La/vvm;->d:La/a2m;

    iput-object p5, p0, La/vvm;->e:Ljava/lang/String;

    iput-object p6, p0, La/vvm;->f:Ljava/lang/String;

    iput-object p7, p0, La/vvm;->g:La/mum;

    iput-boolean p8, p0, La/vvm;->h:Z

    iput-byte p9, p0, La/vvm;->i:B

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
    iget-byte p1, p0, La/vvm;->i:B

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
    iget-object v0, p0, La/vvm;->a:La/mm40;

    .line 18
    .line 19
    iget-object v1, p0, La/vvm;->b:La/vum;

    .line 20
    .line 21
    iget-object v2, p0, La/vvm;->c:La/vum;

    .line 22
    .line 23
    iget-object v3, p0, La/vvm;->d:La/a2m;

    .line 24
    .line 25
    iget-object v4, p0, La/vvm;->e:Ljava/lang/String;

    .line 26
    .line 27
    iget-object v5, p0, La/vvm;->f:Ljava/lang/String;

    .line 28
    .line 29
    iget-object v6, p0, La/vvm;->g:La/mum;

    .line 30
    .line 31
    iget-boolean v7, p0, La/vvm;->h:Z

    .line 32
    .line 33
    invoke-static/range {v0 .. v9}, La/dyb;->s(La/mm40;La/vum;La/vum;La/a2m;Ljava/lang/String;Ljava/lang/String;La/mum;ZLa/fet;I)V

    .line 34
    .line 35
    .line 36
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 37
    .line 38
    return-object p0
.end method
