.class public final synthetic La/zh20;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:Z

.field public final synthetic b:Z

.field public final synthetic c:Z

.field public final synthetic d:I


# direct methods
.method public synthetic constructor <init>(IZZZ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p2, p0, La/zh20;->a:Z

    iput-boolean p3, p0, La/zh20;->b:Z

    iput-boolean p4, p0, La/zh20;->c:Z

    iput p1, p0, La/zh20;->d:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    check-cast v1, La/oyg0;

    .line 6
    .line 7
    move-object/from16 v2, p2

    .line 8
    .line 9
    check-cast v2, La/a820;

    .line 10
    .line 11
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    iget-boolean v1, v0, La/zh20;->a:Z

    .line 18
    .line 19
    if-eqz v1, :cond_0

    .line 20
    .line 21
    sget-object v1, La/jo7;->b:La/jo7;

    .line 22
    .line 23
    :goto_0
    move-object v4, v1

    .line 24
    goto :goto_1

    .line 25
    :cond_0
    iget-object v1, v2, La/a820;->c:La/ko7;

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :goto_1
    iget-object v5, v2, La/a820;->f:La/dzc0;

    .line 29
    .line 30
    const/4 v9, 0x0

    .line 31
    const/16 v11, 0x1f

    .line 32
    .line 33
    const/4 v6, 0x0

    .line 34
    const/4 v7, 0x0

    .line 35
    const/4 v8, 0x0

    .line 36
    iget-boolean v10, v0, La/zh20;->b:Z

    .line 37
    .line 38
    invoke-static/range {v5 .. v11}, La/dzc0;->a(La/dzc0;La/syc0;La/olc0;ZZZI)La/dzc0;

    .line 39
    .line 40
    .line 41
    move-result-object v7

    .line 42
    iget-object v8, v2, La/a820;->g:La/hx4;

    .line 43
    .line 44
    const/4 v13, 0x0

    .line 45
    const/16 v15, 0x1f

    .line 46
    .line 47
    const/4 v9, 0x0

    .line 48
    const/4 v10, 0x0

    .line 49
    const/4 v11, 0x0

    .line 50
    const/4 v12, 0x0

    .line 51
    iget-boolean v14, v0, La/zh20;->c:Z

    .line 52
    .line 53
    invoke-static/range {v8 .. v15}, La/hx4;->a(La/hx4;La/a8q0;La/yyc;La/bx6;La/iwo0;La/knb0;ZI)La/hx4;

    .line 54
    .line 55
    .line 56
    move-result-object v8

    .line 57
    const/16 v18, 0x0

    .line 58
    .line 59
    const v19, 0x3df9b

    .line 60
    .line 61
    .line 62
    const/4 v3, 0x0

    .line 63
    const/4 v5, 0x0

    .line 64
    const/4 v10, 0x0

    .line 65
    const/4 v12, 0x0

    .line 66
    const/4 v13, 0x0

    .line 67
    const/4 v14, 0x0

    .line 68
    iget v15, v0, La/zh20;->d:I

    .line 69
    .line 70
    const/16 v16, 0x0

    .line 71
    .line 72
    const/16 v17, 0x0

    .line 73
    .line 74
    invoke-static/range {v2 .. v19}, La/a820;->a(La/a820;La/txe;La/ko7;La/xm5;La/pvj0;La/dzc0;La/hx4;La/vtb0;ZLa/q4f;FZLa/vf7;IZZZI)La/a820;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    return-object v0
.end method
