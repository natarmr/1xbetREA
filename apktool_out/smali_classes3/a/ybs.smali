.class public final synthetic La/ybs;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:Ljava/lang/String;

.field public final synthetic b:F

.field public final synthetic c:La/eba;

.field public final synthetic d:La/eba;

.field public final synthetic e:F

.field public final synthetic f:F

.field public final synthetic g:Z

.field public final synthetic h:Z


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;FLa/eba;La/eba;FFZZI)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/ybs;->a:Ljava/lang/String;

    iput p2, p0, La/ybs;->b:F

    iput-object p3, p0, La/ybs;->c:La/eba;

    iput-object p4, p0, La/ybs;->d:La/eba;

    iput p5, p0, La/ybs;->e:F

    iput p6, p0, La/ybs;->f:F

    iput-boolean p7, p0, La/ybs;->g:Z

    iput-boolean p8, p0, La/ybs;->h:Z

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
    const/16 p1, 0x1201

    .line 10
    .line 11
    invoke-static {p1}, La/x8x;->L(I)I

    .line 12
    .line 13
    .line 14
    move-result v9

    .line 15
    iget-object v0, p0, La/ybs;->a:Ljava/lang/String;

    .line 16
    .line 17
    iget v1, p0, La/ybs;->b:F

    .line 18
    .line 19
    iget-object v2, p0, La/ybs;->c:La/eba;

    .line 20
    .line 21
    iget-object v3, p0, La/ybs;->d:La/eba;

    .line 22
    .line 23
    iget v4, p0, La/ybs;->e:F

    .line 24
    .line 25
    iget v5, p0, La/ybs;->f:F

    .line 26
    .line 27
    iget-boolean v6, p0, La/ybs;->g:Z

    .line 28
    .line 29
    iget-boolean v7, p0, La/ybs;->h:Z

    .line 30
    .line 31
    invoke-static/range {v0 .. v9}, La/aac;->c(Ljava/lang/String;FLa/eba;La/eba;FFZZLa/fet;I)V

    .line 32
    .line 33
    .line 34
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 35
    .line 36
    return-object p0
.end method
