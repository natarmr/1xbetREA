.class public abstract La/z12;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:La/ykw;

.field public static final b:La/ykw;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, La/ykw;

    .line 2
    .line 3
    sget-object v1, La/x12;->a:La/x12;

    .line 4
    .line 5
    invoke-direct {v0, v1}, La/w12;-><init>(Lkotlin/jvm/functions/Function2;)V

    .line 6
    .line 7
    .line 8
    sput-object v0, La/z12;->a:La/ykw;

    .line 9
    .line 10
    new-instance v0, La/ykw;

    .line 11
    .line 12
    sget-object v1, La/y12;->a:La/y12;

    .line 13
    .line 14
    invoke-direct {v0, v1}, La/w12;-><init>(Lkotlin/jvm/functions/Function2;)V

    .line 15
    .line 16
    .line 17
    sput-object v0, La/z12;->b:La/ykw;

    .line 18
    .line 19
    return-void
.end method
