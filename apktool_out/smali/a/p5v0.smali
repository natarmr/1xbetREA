.class public final La/p5v0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final c:La/w5v0;


# instance fields
.field public final a:La/q5v0;

.field public final b:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, La/w5v0;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-direct {v0, v1}, La/w5v0;-><init>(B)V

    .line 5
    .line 6
    .line 7
    sput-object v0, La/p5v0;->c:La/w5v0;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(La/q5v0;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/p5v0;->a:La/q5v0;

    .line 5
    .line 6
    iput p2, p0, La/p5v0;->b:I

    .line 7
    .line 8
    return-void
.end method
